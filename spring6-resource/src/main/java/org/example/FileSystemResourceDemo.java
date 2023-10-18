package org.example;

import org.springframework.core.io.FileSystemResource;

import java.io.InputStream;

public class FileSystemResourceDemo {
    public static void main(String[] args) {
        //可以访问绝对路径与相对路径文件
        loadFileSystemResourceDemo("E:\\A.txt");
        //相对路径，根目录开始
        loadFileSystemResourceDemo("resourceTestDemo.txt");
    }

    private static void loadFileSystemResourceDemo(String path) {
        FileSystemResource resource = new FileSystemResource(path);
        try{
            InputStream inputStream = resource.getInputStream();
            System.out.println(resource.getFilename());
            System.out.println(resource.getDescription());
            byte[] b = new byte[1024];
            while (inputStream.read(b) != -1){
                System.out.println(new String(b));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
