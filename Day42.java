import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
	System.out.print("masukkan gaji pokok : ");
	double a = s.nextDouble();
	
		System.out.print("masukkan tunjangan : ");
	  double b = s.nextDouble();
		
		System.out.print("masukkan potongan : ");
		double c = s.nextDouble();
		 
		 double gajiBersih = a + b - c;
		 
		 System.out.println("gaji bersih : "+gajiBersih );
		
	}
	
}
