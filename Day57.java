
package nested.loop;

import java.util.Scanner;
public class NestedLoop {


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("masukkan jumlah baris : ");
        int baris = s.nextInt();
        
        System.out.print("masukkan jumlah kolom : ");
        int kolom = s.nextInt();
        
        for (int i = 1; i <= baris; i++) {
            
            for (int j = 1; j <= kolom; j++) {
                System.out.print(i+" , "+j +" ,");
            }
            System.out.println("");
        }
        
        
        
    }
    
}
