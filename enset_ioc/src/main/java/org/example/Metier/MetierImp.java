package org.example.Metier;

import org.example.Dao.IDao;
import org.example.Dao.IDoaImpt;
import org.example.Ext.ext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImp implements Metier{

    //private IDao iDao = new IDoaImpt();

    //@Autowired
    private IDao iDao ;

    public MetierImp(IDao iDao) {
        this.iDao = iDao;
    }

    public MetierImp() {
    }

    @Override
    public double calcule() {
        double tmp = iDao.getData();
        double res = tmp*540/Math.cos(tmp*Math.PI);
        return res;
    }

    public void setiDao (IDao iDao){
        this.iDao = iDao;
    }
}
