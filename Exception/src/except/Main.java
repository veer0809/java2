
package except;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Exception e = new Exception();
		Scanner s = new Scanner(System.in);
		
		
		try {
			System.out.println("Enter the value of x");
			e.x=s.nextInt();
			
			System.out.println("Enter the value of y");
			e.y=s.nextInt();
			
			
			e.cal();
			e.print();
		}
		
		catch(ArithmeticException p) {
			System.out.println("Cannot divide by 0");
			
			
			}
		
		catch(InputMismatchException v) {
			System.out.println("String not allowed");
		}
		}
		
	}


