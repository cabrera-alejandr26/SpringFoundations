package com.example.config;

import com.example.beans.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/*Spring @Configuration annotation is part of the spring core framework.
* Spring Configuration annotation indicates that the class has @Bean definition methods.
* So Spring container can process the class and generate Spring Beans to be used in the application.*/
@Configuration
public class ProjectConfig {
    @Primary
    @Bean(name = "audiVehicle")
    Vehicle vehicle1(){
        //Var object reference will be inferred. Was introduced in Java 10.
        var veh = new Vehicle();
        veh.setName("Audi 8");
        return veh;
    }

    @Bean
    Vehicle vehicle2(){
        //Var object reference will be inferred. Was introduced in Java 10.
        var veh = new Vehicle();
        veh.setName("Honda");
        return veh;
    }

    @Bean
    Vehicle vehicle3(){
        //Var object reference will be inferred. Was introduced in Java 10.
        var veh = new Vehicle();
        veh.setName("Mazda");
        return veh;
    }


}
