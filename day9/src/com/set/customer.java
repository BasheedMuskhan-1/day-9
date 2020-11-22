package com.set;
public class customer implements Comparable{
    
    int cid;
    String cname;
    String cadd;
    public customer(int cid, String cname, String cadd) {
        
        this.cid = cid;
        this.cname = cname;
        this.cadd = cadd;
    }
    @Override
    public int compareTo(Object o) {
        customer c=(customer)o;
        if(this.cid<c.cid)//s2.id < s1.sid
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }
    @Override
    public String toString() {
        return "customer [cid=" + cid + ", cname=" + cname + ", cadd=" + cadd + "]";
    }
}
