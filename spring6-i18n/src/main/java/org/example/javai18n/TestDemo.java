package org.example.javai18n;

import java.util.Locale;
import java.util.ResourceBundle;

public class TestDemo {
    public static void main(String[] args) {
        /**
         * 国际化配置文件命名规范：基本名_语言_国家.properties
         */
        ResourceBundle bundle = ResourceBundle.getBundle("msg", new Locale("zh", "CN"));
        System.out.println(bundle.getString("test"));

        ResourceBundle bundle2 = ResourceBundle.getBundle("msg", new Locale("en", "UK"));
        System.out.println(bundle2.getString("test"));
    }
}
