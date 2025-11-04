package latihan.pkg2;

import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
        System.out.print("masukkan angka dari 1 sampai N : ");
       int angka = s.nextInt();
        
        for (int i = 1; i <= angka; i++) {
           
               
               
            System.out.println(i);
          
            }
        System.out.print("\nmasukkan angka dari N Sampai 1 : ");
        int angka2 =s.nextInt();
        for (int i = angka2; i >=1 ; i--) {
            System.out.println(i);
        }
        }
            
      
    }
    
