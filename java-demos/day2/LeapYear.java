import java.util.Scanner;

class LeapYear {

	public static void main(String[] args){
	
	Scanner keyboardInput = new Scanner(System.in);
	
	int year = keyboardInput.nextInt();
	
	if( year % 4 == 0 & (  (year % 100 != 0) || (year % 400 == 0)  ) ){
	
		System.out.println(year + " is a leap year");
		
	} else {
	
		System.out.println(year + " is not a leap year");
		
	}
	
	}

}