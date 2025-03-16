package org.example;

import org.example.Dao.IDoaImpt;
import org.example.Metier.Metier;
import org.example.Metier.MetierImp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main3 {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationConfig.xml");

        Metier metier = (Metier) context.getBean("metier");
        System.out.println(metier.calcule());
    }
}