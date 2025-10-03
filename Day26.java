import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//Operator penugasan (+, -, *, /, %)
		int angka ;
		
System.out.println("Operator penugasan (+, -, *, /, %");
	
	System.out.print("\nMasukkan angka : ");
	angka = sc.nextInt();
	System.out.print("penjumlahan/tambah (+=) : ");
	angka +=sc.nextInt();
System.out.println("hasilnya (+=) = "+ angka);
	
		
	
	System.out.print("\nMasukkan angka : ");
	angka = sc.nextInt();
	System.out.print("pengurangan/kurang (-=) : ");
	angka -=sc.nextInt();
	System.out.println("hasilnya (-=) = "+ angka);
	
		
	System.out.print("\nMasukkan angka : ");
	angka = sc.nextInt();
	System.out.print("perkalian (*=) : ");
	angka *=sc.nextInt();
	System.out.println("hasilnya (*=) = "+ angka);
	
		
	System.out.print("\nMasukkan angka : ");
	angka = sc.nextInt();
	System.out.print("pembagian (/=) : ");
	angka /=sc.nextInt();
	System.out.println("hasilnya (/=) = "+ angka);

	System.out.print("\nMasukkan angka : ");
	angka = sc.nextInt();
	System.out.print("modulus/sisa bagi (%=) : ");
	angka %=sc.nextInt();
	System.out.println("hasilnya (%=) = "+ angka);
	

	}
}
