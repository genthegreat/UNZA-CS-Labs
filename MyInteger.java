class MyInteger {
	String hex = "";
	
	public MyInteger(int integer){
		
	}
	
	public String Dec2Hex (int decimal){
		while (decimal != 0){
			int hexValue = decimal % 16;
			
			char hexDigit = (hexValue <= 9 && hexValue >= 0) ? char (hexValue + '0') : (char)(hexValue - 10 + 'A');
			
			hex = hexDigit + hex;
			
			decimal = decimal / 16;
		}
		
		return hex;
	}
}