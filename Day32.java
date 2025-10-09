import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//operator logika OR (||) 
		System.out.print("masukkan umur : ");
		int umur = sc.nextInt();
		System.out.print("apakah punya sim? (true/false) : ");
		boolean punyaSim=sc.nextBoolean();
		
		if (umur >=18 || punyaSim) {
		System.out.println("\nboleh mengemudi");
		} else {
		    System.out.println("\n tidak boleh mengemudi ");
		}
		
		
	}
}
