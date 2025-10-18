package mirwan;

import java.util.Scanner;
public class Mirwan {

    public static void main(String[] args) {
Scanner s = new Scanner(System.in);

        System.out.print("masukkan angka pertama : ");
        int angka1 = s.nextInt();
        
        System.out.print("masukkan operator (+, -, *, /) : ");
        char operasi = s.next().charAt(0);
        
        System.out.print("masukkan angka kedua : ");
        int angka2 = s.nextInt();
        
        
        int hasil = 0;
        
        if (operasi == '+'){
            hasil = angka1 + angka2;
        }else if (operasi == '-'){
            hasil = angka1 - angka2;
        }else if (operasi == '*'){
            hasil = angka1 * angka2;
        }else if (operasi == '/'){
            hasil = angka1 / angka2;
            
        }else {
            System.out.println("operasi tidak dikenal");
        }
            System.out.println("hasil  : "+ hasil);
        
    
    }
    
}
