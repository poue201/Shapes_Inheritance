class Exercise {
	public static void main(String[] args) {
		int n = 0;
	
		while( n < 10) {
		
		//System.out.print(n + " ");
		// output 2 rasied to the power of n
		//System.out.println(n + " " + ( Math.pow(2, n) ) );
			int n10 = raiseToThePower(2, n);
			System.out.println(n + " " + n10);
			n++;
			
		
		}
		
	}
	
	public static int raiseToThePower(int baseNum, int powNum) {
		int result = 1;
		for(int i =0; i < powNum; i++) {
			result = result * baseNum;
		}
		return result;
	}
}