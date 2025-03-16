package org.example.Dao;

import com.sun.org.glassfish.gmbal.ManagedObject;
import org.springframework.stereotype.Component;

@Component
public class IDoaImpt implements IDao{

    @Override
    public double getData() {
        System.out.println("un");
        double tmp = Math.random()*40;
        return tmp;
    }
}
