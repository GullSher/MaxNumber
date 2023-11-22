import java.util.Scanner;

public class MaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner= new Scanner(System.in);
System.out.println("Please Enter 1st Number.");
double Num1 =scanner.nextDouble();
System.out.println("Please Enter 2nd Number.");
double Num2 =scanner.nextDouble();
System.out.println("Please Enter 3rd Number");
double Num3 =scanner.nextDouble();
// Now Find the Maximum Number out of 3
double Max1 =findMax(Num1, Num2, Num3);
// Display the Result 
System.out.println("The Maximum Number out of three Number is: "+ Max1 );
	//close the scanner
	scanner.close();
	}
//Method to find the Maximum number out of Entered three Numbers.
	private static double findMax(double a , double b, double c) {
		
		double max=a;
		if(b > max) {
			max = b;
			
		}
		if( c > max) {
			
	max = c;		
		}
		
		return max;
	}
	
	
}
