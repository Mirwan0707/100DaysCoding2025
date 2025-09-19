package scannerday12;
import java.util.Scanner;
public class ScannerDay12 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        
        String nama, sekolah, nim, alamat;
       
        System.out.print("masukkan nama = ");
        nama=input.nextLine();
        System.out.print("masukkan sekolah = ");
        sekolah=input.nextLine();
        System.out.print("masukkan nim = ");
        nim=input.nextLine();
        System.out.print("masukkan alamat = ");
        alamat=input.nextLine();
        
        System.out.println("\nbiodata mahasiswa:");
        System.out.println("nama lengkap = "+ nama);
        System.out.println("sekolah      = "+ sekolah);
        System.out.println("nim          = "+ nim);
        System.out.println("alamat       = "+ alamat);
    }
    
}
