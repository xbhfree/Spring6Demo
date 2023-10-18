package org.example;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.UrlResource;

import java.io.IOException;
import java.net.MalformedURLException;

public class UrlResourceDemo {
    public static void main(String[] args) {
        //http 前缀
        loadUrlResource("https:www.baidu.com");
        //file 前缀
        loadUrlResource("file:resourceTestDemo.txt");

    }

    private static void loadUrlResource(String path) {
        UrlResource resource = null;
        try {
            resource = new UrlResource(path);
            System.out.println(resource.getURL());
            System.out.println(resource.getDescription());
            System.out.println(resource.getFilename());
            //System.out.println(resource.getInputStream().read());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
