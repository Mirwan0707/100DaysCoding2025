
package latihan.pkg2;

import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan umur anda: ");
        int umur = input.nextInt();

        switch (1) {
            case 1:
              
                String hasil = (umur >= 17) ? "sudah dewasa" : "belum dewasa";
                System.out.println("umur anda " + umur +" ,"+ " anda " + hasil);
                break;
        }
    }
}
