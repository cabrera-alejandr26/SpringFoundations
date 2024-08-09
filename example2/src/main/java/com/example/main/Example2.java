package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class); //Where we defined our configurations.

        Vehicle veh = context.getBean(Vehicle.class); //Get the bean of Vehicle.class
        System.out.println("Vehicle: " + veh.getName());

    }
}
