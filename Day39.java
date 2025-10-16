import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("===Menu makanan===");
        System.out.println("1. bakso : Rp10.000");
        System.out.println("2. nasi goreng : Rp13.000");
        System.out.println("3.ayam geprek : Rp10.000");
        
        System.out.print(" \n masukan angka untuk pesan : " );
        int pilihan =input.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memilih = 1. Bakso : Rp10.000");
        }else if(pilihan == 2) {
            System.out.println("Anda memilih = 2. nasi goreng : Rp13.000");
            } else if (pilihan == 3) {
                System.out.println("anda memilih = 3. ayam geprek : Rp10.000"); 
        } else {
            System.out.println("pesanan tidak ad dalam menu");
        }
    }
}
