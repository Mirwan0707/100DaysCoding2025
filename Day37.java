import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
   System.out.print("masukkan angka : ");
     int n = s.nextInt();
     
     if ( n % 2 == 0){
         System.out.println("angka genap");
     }else{
         System.out.println("angka ganjil");
}     
	}
}
