import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//operator logika Not (!) 
System.out.print("apakah punya kunci? (true/false) : ");
		boolean kunci=sc.nextBoolean();
	System.out.println("boleh pergi jalan : "+ kunci);	
		System.out.println("tidak boleh pergi : "+!kunci);
		
		
	}
}
