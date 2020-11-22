package com.set;

import java.util.Comparator;

 

public class MainSet implements Comparator {

 

    @Override
    public int compare(Object o1, Object o2) {
        // TODO Auto-generated method stub
        
        customer c1=(customer)o1;
        customer c2=(customer)o2;
        
        if(c1.cid<c2.cid)
        {
            return 1;
        }
        else
        {
            return -1;
        }
        
        
    }

 

}
