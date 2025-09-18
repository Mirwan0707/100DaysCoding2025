	import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int tahun = 2025;
		System.out.print("Ketik Tahun lahir kamu :");
		Scanner input = new Scanner (System.in);
		
		tahun = input.nextInt();
		System.out.println("tahun = " + tahun);
		
	}
}
