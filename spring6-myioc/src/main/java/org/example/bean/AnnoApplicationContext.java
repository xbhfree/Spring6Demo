package org.example.bean;

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

    //设置包扫描规则

    //当前包及其子包，有@Bean注解的类，把该类实例化

    //创建有参构造

    public AnnoApplicationContext(String basePackage) {
        //1. 把包名改成文件地址
        String packagePath = basePackage.replaceAll("\\\.", "\\\\");
        //2. 根据包名找绝对地址
        Enumeration<URL> urls = Thread.currentThread().getContextClassLoader().getResources(packagePath);
        while (urls.hasMoreElements()){
            URL url = urls.nextElement();
            String filePath = URLDecoder.decode(url.getFile(), "utf-8");
            String rootPath = filePath.substring(0, filePath.length() - basePackage.length());
            //包扫描
            loadBean(new File(filePath));
        }

    }

    private void loadBean(File fIle) {
        //1.判断当前是否为文件夹

        //2.获取文件夹内所有内容

        //3.判断文件夹是否为空，空返回

        //4.如果不为空，遍历

        //4.1是文件夹，继续递归

        //4.2是文件，得到包路径+类名称-字符串截取

        //4.3判断是否为.class文件

        //4.4是的话，把路径\替换成.

        //4.5判断类上面是否有@Bean注解，有则实例化

        //4.6对象实例化后放入beanFactory
    }
}
