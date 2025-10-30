package latihan.pkg2;

import java.util.Scanner;
public class Latihan2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
        System.out.print("masukkan angka dari pertama : ");
       int angka = s.nextInt();
        

       
       while (angka <= 10){
           if (angka == 5){
               System.out.println("perulangan dihentikan pada angka : "+angka);
               break;
           }
       
           
        System.out.println(angka);
       angka++;
    }
    }
}
