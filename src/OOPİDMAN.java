/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author SAVAS
 */
public class OOPİDMAN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("İdman programına hoşgeldiniz...");
        
        String idmanlar="Geçerli Hareketler\n"+"burpee\n"+"pushup\n"+"situp\n"+"squat\n";
        System.out.println(idmanlar);
        
        System.out.println("idman programınızı oluşturunuz");
        
        System.out.print("burpee sayısı:");
         int burpee=scanner.nextInt();
        
        System.out.print("pushup sayısı:");
         int pushup=scanner.nextInt();
         
        System.out.print("situp sayısı:");
         int situp=scanner.nextInt();
         
         System.out.print("squat sayısı:");
         int squat=scanner.nextInt();
         scanner.nextLine();
         
        Idman ıdman =new Idman(burpee,pushup,situp,squat);
       
        while (ıdman.idmansonu()==false) {
           
            System.out.println("Hareket türünü giriniz:");
            String tur=scanner.nextLine();
            System.out.println("Hareket sayısını giriniz:");
            int sayı=scanner.nextInt();
            scanner.nextLine(); 
            ıdman.HareketYap(tur, sayı);
        }
    }
    
}
