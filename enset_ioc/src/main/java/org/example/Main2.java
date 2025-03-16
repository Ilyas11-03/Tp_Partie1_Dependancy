package org.example;

import org.example.Dao.IDao;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException {

        Scanner scanner = new Scanner(new File("config.txt"));
        String doaClassName = scanner.nextLine();
        Class cDoa = Class.forName(doaClassName);

        IDao dao = (IDao) cDoa.newInstance();
        System.out.println(dao.getData());
    }
}