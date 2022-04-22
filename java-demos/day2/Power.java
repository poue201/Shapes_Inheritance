class Power {
	public static void main(String[] args) {
		int n = 1;
		
		int base = 2, power = n;
		int result = 1;
		
		
		// running loop while the power > 0
		while( power < 10) {
			result = result * base;
			System.out.println(power + " " + result);
			power++;
			
		
		}
		
	}
	
	
}