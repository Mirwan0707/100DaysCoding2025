import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	
     System.out.print("masukkan angka : ");
        int angka = s.nextInt();
           
              
             for (int i = 1; i <= angka; i++) {
                System.out.println(i);
        }
    }
}
