package com.example.myspringcloud2.myspringcloudtwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
@EnableHello
public class MySpringCloudTwoApplication {

    public static void main(String[] args) {


        ApplicationContext applicationContext = SpringApplication.run(MySpringCloudTwoApplication.class, args);

        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        List<String> name = Arrays.stream(beanDefinitionNames).filter(item->item.indexOf("hello")!=-1).collect(Collectors.toList());
        System.out.println(applicationContext.getBean("helloServic").toString());
        name.stream().forEach(item-> System.out.println(name));
        ((HelloServic)(applicationContext.getBean(HelloServic.class))).sayHello();
    }

}
