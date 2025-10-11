import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("soal 1.");
System.out.print("nyawa awal pemain : ");
int nyawa1 = s.nextInt();
int naiklevel = nyawa1 ++;
int kenajebakan = naiklevel --;
 System.out.print("nyawa terakhir pemain : "+ kenajebakan);


System.out.println("\nsoal 2.");
System.out.print(" saldo awal : ");
int a = s.nextInt();
System.out.print(" uang ditabung : ");
int b = s.nextInt();
System.out.print("uang diambil : ");
int c = s.nextInt();
a += b;
a -= c;
System.out.println(" saldo akhir : "+ a);

        
System.out.println("\nSoal 3.");
        System.out.print(" kode sistem : ");
        int sistem = s.nextInt();
        System.out.print(" kode user : ");
        int user= s.nextInt();
boolean LoginBerhasil = sistem == user;
boolean loginGagal = sistem != user;
        
System.out.println(LoginBerhasil);
		

   System.out.println("\nsoal 4.");
        System.out.print("umur peserta :");
        int umur = s.nextInt();
        boolean bisa = umur > 17;
        System.out.println(bisa);
        
        
   System.out.println("\nsoal 5.");
   System.out.print("nilai ujian : ");
   int nilai = s.nextInt();
   boolean hasil = nilai >= 75;
   System.out.println(hasil);
   
   
   System.out.println("\nsoal 6.");
   System.out.print("nilai siswa : ");
   int siswa= s.nextInt();
   System.out.print("kehadiran : ");
   int kehadiran = s.nextInt();
   boolean beasiswa = (nilai >= 85) && (kehadiran >= 90);
   System.out.println(beasiswa);
   
 System.out.println("\nsoal 7. ");
   System.out.print("Status kartu member (true/false) : ");
   boolean kartu= s.nextBoolean();
   System.out.print("jumlah barang : ");
   int barang = s.nextInt();
   boolean dapatdiskon = kartu || (barang >3);
   System.out.println(dapatdiskon);
   
   
System.out.println("\n Soal 8.");
   System.out.print("Status hari libur (true/false) : ");
   boolean libur= s.nextBoolean();
   boolean hari = !libur;
   System.out.println(libur);
   
   
	}
}
