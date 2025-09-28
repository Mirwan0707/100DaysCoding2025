public class Main {
	public static void main(String[] args) {
		int a = 8;
		int b = 2;
		
		System.out.println("nilai sebelum ditukar");
		System.out.println("nilai a :"+ a);
		System.out.println("nilai b :"+ b);
		
		
		System.out.println("\nnilai sesudah ditukar");
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("nilai a : "+ a);
		System.out.println("nilai b : "+ b);
	}
}
