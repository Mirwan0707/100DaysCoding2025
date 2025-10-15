import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print(" masukan angka : ");
		int bilangan = s.nextInt();

		if (bilangan > 0) {
		  System.out.println("bilangan positif");
		  }  else if (bilangan < 0) {
		    System.out.println("bilangan negatif");
		    
		  }  else {
		    System.out.println("bilangan nol");  
		}    
		
	
	}
}
