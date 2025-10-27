package latihan.pkg2;

import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        switch (1) {
            case 1:
              
                String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
                System.out.println("Angka " + angka + " adalah " + hasil);
                break;
        }
    }
}
