package org.example.bean;

import org.example.anno.Bean;

import java.io.File;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;

public class AnnoApplicationContext implements ApplicationContext{
    private HashMap<Class, Object> beanFactory = new HashMap<>();
    //返回对象
    @Override
    public Object getBean(Class clazz) {
        return beanFactory.get(clazz);
    }

    private String rootPath;
    //设置包扫描规则

    //当前包及其子包，有@Bean注解的类，把该类实例化

    //创建有参构造

    public AnnoApplicationContext(String basePackage) {
        //1. 把包名改成文件地址
        String packagePath = basePackage.replaceAll("\\.", "\\\\");
        //2. 根据包名找绝对地址
        Enumeration<URL> urls = null;
        try{
            urls  = Thread.currentThread().getContextClassLoader().getResources(packagePath);
        }catch (Exception e){
            e.printStackTrace();
        }
        while (urls.hasMoreElements()){
            URL url = urls.nextElement();
            String filePath = null;
            try {
                filePath = URLDecoder.decode(url.getFile(), "utf-8");
            }catch (Exception e){
                e.printStackTrace();
            }
            rootPath = filePath.substring(0, filePath.length() - basePackage.length());
            //包扫描
            loadBean(new File(filePath));
        }

    }

    private void loadBean(File file) {
        //1.判断当前是否为文件夹
        if(file.isDirectory()){
            //2.获取文件夹内所有内容
            File[] childFiles = file.listFiles();
            if (childFiles == null || childFiles.length == 0){
                return;
            }
            //4.1 非空遍历
            for (File childFile : childFiles) {
                // 文件夹递归遍历
                if (childFile.isDirectory()){
                    loadBean(childFile);
                }else{
                    //4.2是文件，得到包路径+类名称-字符串截取
                    String pathWithClass = childFile.getAbsolutePath().substring(rootPath.length() - 1);
                    //4.3判断是否为.class文件
                    if (pathWithClass.contains(".class")){
                        //4.4把路径\替换成.,把.class去掉
                        String allName = pathWithClass.replaceAll("\\\\","\\.").replace(".class","");
                        //4.5判断类上面是否有@Bean注解，有则实例化
                        Class<?> clazz = null;
                        try {
                            clazz = Class.forName(allName);
                        }catch (Exception e){
                            e.printStackTrace();
                        }
                        //4.6 判断不是接口
                        if (!clazz.isAnnotation()){
                            Bean annotation = clazz.getAnnotation(Bean.class);
                            //非空判断，确定有该注解
                            if (annotation != null){
                                //instance 实例
                                Object instance = null;
                                try {
                                    instance = clazz.getConstructor().newInstance();
                                }catch (Exception e){
                                    e.printStackTrace();
                                }
                                //getInterfaces() 获取该类所有接口
                                if (clazz.getInterfaces().length > 0){
                                    //取第一个接口值作为key，有问题
                                    beanFactory.put(clazz.getInterfaces()[0], instance);
                                }else{
                                    beanFactory.put(clazz, instance);
                                }
                            }
                        }

                    }
                }
            }
        }



        //4.6对象实例化后放入beanFactory
    }
}
