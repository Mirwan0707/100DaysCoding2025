
package myrwan;
import java.util.Scanner;
public class Myrwan {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        System.out.print("masukkan angka pertama : ");
        int angka1 = s.nextInt();
        
        System.out.print("masukkan operator (+, -, *, /) : ");
        char operator = s.next().charAt(0);
        
        System.out.print("masukkan angka kedua : ");
        int angka2 = s.nextInt();
         
        int hasil;
        switch (operator) {
            case '+':
                hasil =angka1 + angka2;
                System.out.println("hasil dari: " + angka1 + " + " + angka2 + " = " + hasil);
                break;
 
            case '-':
                hasil =angka1 - angka2;
                System.out.println("hasil dari: " + angka1 + " - " + angka2 + " = " + hasil);
                break;
                
            case '*':
                hasil =angka1 * angka2;
                System.out.println("hasil dari: " + angka1 + " * " + angka2 + " = " + hasil);
                break;
                
            case '/':
                hasil =angka1 / angka2;
                System.out.println("hasil dari: " + angka1  + " / " + angka2 + " = " + hasil);
                break;
                
            default:
                System.out.println("operator tidak valid, silahkan masukkan sesuai dengan yang diperintahkan. TERIMA KASIH");
                
        }
        
    }
    
}
