/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;
import java.io.Serializable;



/**
 *
 * @author eder0
 */
public class Preguntas implements Serializable {

    
    private String p;
    private String rc;
    private String r1;
    private String r2;
    private String r3;
    
    
public Preguntas(String a,String b,String n,String c,String d){
    p=a;
    rc=n;
    r1=b;
    r2=c;
    r3=d;
}


    
    
    @Override
    public String toString(){
        return p+" "+rc+" "+r1+" "+r2+" "+r3;
    }
    public String getP() {
        return p;
    }

    /**
     * @param p the p to set
     */
    public void setP(String p) {
        this.p = p;
    }

    /**
     * @return the rc
     */
    public String getRc() {
        return rc;
    }

    /**
     * @param rc the rc to set
     */
    public void setRc(String rc) {
        this.rc = rc;
    }

    /**
     * @return the r1
     */
    public String getR1() {
        return r1;
    }

    /**
     * @param r1 the r1 to set
     */
    public void setR1(String r1) {
        this.r1 = r1;
    }

    /**
     * @return the r2
     */
    public String getR2() {
        return r2;
    }

    /**
     * @param r2 the r2 to set
     */
    public void setR2(String r2) {
        this.r2 = r2;
    }

    /**
     * @return the r3
     */
    public String getR3() {
        return r3;
    }

    /**
     * @param r3 the r3 to set
     */
    public void setR3(String r3) {
        this.r3 = r3;
    }
    

 
   
}
