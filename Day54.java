package latihan.pkg2;

import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
        System.out.print("masukkan angka dari 1: ");
       int angka = s.nextInt();
        
        for (int i = angka; i <= 10; i++) {
            if (i == 5){
               
                continue;
            }
            System.out.println(i);
        }
            System.out.println("\nperulangan dilewati di angka - 5");
      
    }
    }
