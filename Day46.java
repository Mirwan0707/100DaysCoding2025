
package mirwanmi;

import java.util.Scanner;
public class Mirwanmi {

    public static void main(String[] args) {
   Scanner s = new Scanner (System.in);
        int pilihan;
        double harga = 0;
        
        
        System.out.println("==menu makanan==");
        System.out.println("1. nasi goreng  :Rp.10.000 ");
        System.out.println("2. bakso        : Rp.12.000 ");
        System.out.println("3. ayam geprek  : Rp.15.000 ");
        
        System.out.print("\nmasukkan pilihan menu makanan (1-3) : ");
        pilihan = s.nextInt();
        System.out.println("\npilihan saya : "+pilihan);
        
        switch (pilihan) {
            case 1:
                System.out.println("anda memilih nasi goreng");
                harga =10000;
              break;
            case 2:
                System.out.println("anda memilih bakso");
                harga =12000;
              break;
            case 3:
                System.out.println("anda memilih ayam geprek");
                harga =15000;
              break;
        
            
            default:
              System.out.println("pilihan tidak ada dalam menu");
             break;
        }
        System.out.println("total bayar : "+harga);
            
        
        }
    }
    
