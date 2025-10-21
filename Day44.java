import java.util.Scanner;

public class PredikatNilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("Masukkan nilai Anda: ");
        int nilai = input.nextInt();
        
        char predikat;
        String keterangan;
        if (nilai >= 85) {
            predikat = 'A';
            keterangan = "lulus (sangat baik)";
            
        } else if (nilai >= 70) {
            predikat = 'B';
            keterangan = "lulus (baik)";
       
         } else if (nilai >= 55) {
            predikat = 'C';
            keterangan = "lulus (cukup)";
            
        } else if (nilai >= 40) {
            predikat = 'D';
            keterangan = "tidak lulus (kurang)";
            
        } else if (nilai >= 0) {
            predikat = 'E';
            keterangan = "tidak lulus (sangat kurang)";
         
        }else{
            predikat = '-';
            keterangan = "nilai tidak balid";
            
        }
        System.out.println("Nilai Anda : " + nilai);
        System.out.println("Predikat : " + predikat);
          System.out.println("Keterangan : " + keterangan);
         
    }
}
