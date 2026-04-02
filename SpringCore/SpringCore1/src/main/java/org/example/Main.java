package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("applicationconfig.xml");


//        Sarees sarees =new Sarees();
//        SeesuShop se=new SeesuShop(sarees);
//         SeesuShop su=se;

//        int a= 10;
//         int  b=a;
//        se.buyTheProduct(5800.20);

        SeesuShop s = container.getBean(SeesuShop.class);
        s.buyTheProduct(6000.50);
        System.out.println(container.getBeanDefinitionCount());
    }
}