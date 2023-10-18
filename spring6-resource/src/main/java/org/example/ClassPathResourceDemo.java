package org.example;

import org.springframework.core.io.ClassPathResource;

import java.io.InputStream;

public class ClassPathResourceDemo {
    public static void main(String[] args) {
        loadClassPathResource("test.txt");
    }

    private static void loadClassPathResource(String path) {
        ClassPathResource resource = new ClassPathResource(path);
        System.out.println(resource.getFilename());
        System.out.println(resource.getDescription());
        //获取文件内容
        try {
            InputStream inputStream = resource.getInputStream();
            byte[] b = new byte[1024];
            while (inputStream.read(b)!=-1){
                System.out.println(new String(b));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
