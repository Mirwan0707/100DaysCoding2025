import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("--soal nomor 2--");
		
			System.out.print("pasokan awal : ");
			int awal = s.nextInt();
			
				System.out.print("jumlah pengiriman : ");
				int akhir = s.nextInt();
				
				int hasil = awal - akhir;
				
				System.out.println("sisa stok : "+ hasil);
	}
}
