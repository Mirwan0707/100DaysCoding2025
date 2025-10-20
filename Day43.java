import java.util.Scanner;

public class Kelipatan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan batas angka: ");
        int batas = input.nextInt();

        System.out.println("\nKelipatan 3:");
        for (int i = 1; i <= batas; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nKelipatan 5:");
        for (int i = 1; i <= batas; i++) {
            if (i % 5 == 0 && i % 3 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\n\nKelipatan 3 dan 5:");
        for (int i = 1; i <= batas; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
       
                  System.out.print(i + " ");
                  
            }
        }

        
    }
}
