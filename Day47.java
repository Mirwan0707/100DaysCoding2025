
package mirwanmi;

import java.util.Scanner;
public class Mirwanmi {

    public static void main(String[] args) {
   Scanner s = new Scanner (System.in);
    
        
        System.out.print("masukkan hari dari angka(1-7) : ");
       int angkaHari= s.nextInt();
       
     
        String hari = "";
        switch (angkaHari) {
            case 1:
                hari = "hari senin";
               break;
               
            case 2:
                hari = "hari selasa";
                break;
                
            case 3:
                hari = "hari rabu";
            break;
            
            case 4:
                 hari = "hari kamis";
            break;
            
            case 5:
                 hari = "hari jum'at";
            break;
            
            case 6:       
                hari = "hari sabtu";
            break;
            
            case 7:
                 hari = "hari minggu";
            break;
        
            
            default:
              System.out.println("pilihan tidak sesuai yang diperintahkan");
             break;
        }
        System.out.println("hari ini adalah  "+hari);
            
        
        }
    }
    
