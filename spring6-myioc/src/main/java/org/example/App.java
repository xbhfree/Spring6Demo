package org.example;

import org.example.bean.AnnoApplicationContext;
import org.example.bean.ApplicationContext;
import org.example.service.UserService;
import org.example.service.UserServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnoApplicationContext("org.example");
        UserService service = (UserService) context.getBean(UserService.class);
        service.run();
    }
}
