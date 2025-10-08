import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("masukkan umur : ");
		int umur = sc.nextInt();
		System.out.print("apakah punya ktp ? (true/false) : ");
		boolean punyaKTP=sc.nextBoolean();
		
		if (umur >=18 && punyaKTP) {
		System.out.println("boleh masuk");
		} else {
		    System.out.println("tidak boleh masuk");
		}
		
		
	}
}
