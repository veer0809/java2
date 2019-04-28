
public class Consult extends Employee {
	
	float hr;
	float rate;
	
	
	Consult(){
		
	}
	
	void cal() {
		salary=hr*rate;
		
	}
	
	
	void print() {
		super.print();
		System.out.println("The total hours are" +hr);
		System.out.println("The rate per hour is " +rate);
		
	}
}
