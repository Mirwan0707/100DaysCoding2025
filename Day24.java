import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
    
		System.out.print("masukkan jari jari : ");
		double r = input.nextDouble();
		double luas = Math.PI *r*r;
		
		System.out.println("jadi luas lingkarannya adalah  : "+ luas + "cm");
	}
}
