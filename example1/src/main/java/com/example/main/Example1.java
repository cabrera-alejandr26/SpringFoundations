package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class); //Where we defined our configurations.

        Vehicle veh = context.getBean(Vehicle.class); //Get the bean of Vehicle.class
        System.out.println("Vehicle: " + veh.getName());
        veh.printHello();
        context.close();

//        /*We don't need to do any explicit casting while fetching a bean from context. Spring is smart enough to look for a bean of the type you requested in this context.
//        *If such a bean doesn't exist, Spring will throw an exception*/
//        String hello = context.getBean(String.class);
//        System.out.println(hello);
//
//        Integer num = context.getBean(Integer.class);
//        System.out.println(num);
    }
}
