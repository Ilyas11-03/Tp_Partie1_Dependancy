package org.example.Ext;

import org.example.Dao.IDao;

public class ext implements IDao {
    @Override
    public double getData() {
        System.out.println("deux");
        double tmp = 6000;
        return tmp;
    }
}
