package org.example;

import org.example.Dao.IDoaImpt;
import org.example.Metier.MetierImp;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        IDoaImpt iDoaImpt = new IDoaImpt();
        MetierImp metierImp = new MetierImp();
        metierImp.setiDao(iDoaImpt);
        System.out.println(metierImp.calcule());
    }
}