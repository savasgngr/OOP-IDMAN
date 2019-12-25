
import jdk.nashorn.internal.parser.TokenType;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SAVAS
 */
public class Idman {
    
    private  int burpee;
    private  int pushup;
    private int situp;
    private int squat;

    public Idman(int burpee, int pushup, int situp, int squat) {
        this.burpee = burpee;
        this.pushup = pushup;
        this.situp = situp;
        this.squat = squat;
    }

    public int getBurpee() {
        return burpee;
    }

    public void setBurpee(int burpee) {
        this.burpee = burpee;
    }

    public int getPushup() {
        return pushup;
    }

    public void setPushup(int pushup) {
        this.pushup = pushup;
    }

    public int getSitup() {
        return situp;
    }

    public void setSitup(int situp) {
        this.situp = situp;
    }

    public int getSquat() {
        return squat;
    }

    public void setSquat(int squat) {
        this.squat = squat;
    }
    
    public void HareketYap(String HareketTuru,int sayı)
    {
        if (HareketTuru.equals("burpee")){
            
            burpeeyap(sayı);
            
        }else if (HareketTuru.equals("pushup")){
            
            pushupyap(sayı);

        }else if (HareketTuru.equals("situp")) {
            
            situpyap(sayı);
        }else if (HareketTuru.equals("squat")) {
            
            squatyap(sayı);
        }else {
            
            System.out.println("geçersiz hareket.");
        }

        
    }
    
    public void burpeeyap(int sayı){
        
        if (burpee==0) {
            
            System.out.println("burpee idmanını bitirdiniz tebrikler. sıradaki harekete geçebilirsiniz");
        }else
        {
            burpee-=sayı;
            System.out.println("Hedef burpee:"+burpee);
        }
    }
     public void pushupyap(int sayı){
        
        if (pushup==0) {
            
            System.out.println("pushup idmanını bitirdiniz tebrikler. sıradaki harekete geçebilirsiniz");
        }else
        {
            pushup-=sayı;
            System.out.println("Hedef pushup:"+pushup);
        }
    }
      public void situpyap(int sayı){
        
        if (situp==0) {
            
            System.out.println("situp idmanını bitirdiniz tebrikler. sıradaki harekete geçebilirsiniz");
        }else
        {
            situp-=sayı;
            System.out.println("Hedef situp:"+situp);
        }
    }
       public void squatyap(int sayı){
        
        if (squat==0) {
            
            System.out.println("squat idmanını bitirdiniz tebrikler. sıradaki harekete geçebilirsiniz");
        }else
        {
            squat-=sayı;
            System.out.println("Hedef squat:"+squat);
        }
    }
       
       public boolean idmansonu()
        {
    
                return (burpee==0)&&(situp==0)&&(pushup==0)&&(squat==0);
        }
}
