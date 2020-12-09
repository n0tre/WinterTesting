package com.ncedu.task;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Field field = context.getBean("field", Field.class);
        field.addWorker("Serge");
        field.addWorker("Michael");
        field.addWorker("Valentine");
        field.addWorker("Nicole");


        field.whatAboutPercents();
        field.fieldManage();
        field.whatAboutPercents();
        field.fieldManage();
        field.whatAboutPercents();
        field.fieldManage();


        ((AnnotationConfigApplicationContext) context).close();


    }
}
