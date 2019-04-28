import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
//		Perm p = new Perm();
//		
//		System.out.println("Enter the name");
//		p.name=scan.nextLine();
//		
//		System.out.println("Enter id");
//		p.id=scan.nextInt();
//		
//		scan.nextLine();
//		
//		System.out.println("The basic salary is");
//		p.basic=scan.nextFloat();
//		
//		p.cal();
//		p.print();

		
			Consult c = new Consult();
			
		System.out.println("Enter the name");
		c.name=scan.nextLine();
			
		System.out.println("Enter the id");
		c.id=scan.nextInt();
			
		scan.nextLine();
			
		System.out.println("Enter the number of hours");
		c.hr=scan.nextFloat();
			
		System.out.println("Enter the rate");
		c.rate=scan.nextFloat();
			
		c.cal();
		c.print();
	}

}
