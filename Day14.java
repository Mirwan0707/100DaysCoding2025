public class Main {
	public static void main(String[] args) {
		
		String strDouble = "2.33";
		double doubleValue = Double.parseDouble(strDouble);
		System.out.println("String ke double= " + doubleValue);
		
		
		String strByte = "77";
		byte byteValue = Byte.parseByte(strByte);
    System.out.println("String ke byte \t= " + byteValue);
		
		
		String strInt = "777";
		int intValue = Integer.parseInt(strInt);
        System.out.println("String ke int \t= " + intValue);
		
	
		String strLong = "72";
		long longValue = Long.parseLong(strLong);	
    System.out.println("String ke Long \t= "+ longValue);
		
	}
}
