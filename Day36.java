import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Apakah punya KTP? (true/false): ");
        boolean punyaKTP = input.nextBoolean();

        if (umur >= 17) {
            if (punyaKTP) {
                System.out.println("Boleh masuk ke acara dewasa");
            } else {
                System.out.println("Belum punya KTP");
            }
        } else {
            System.out.println("Umur belum cukup");
        }
    }
}
