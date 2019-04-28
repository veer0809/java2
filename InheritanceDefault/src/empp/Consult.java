package empp;

public class Consult extends Employee {
	
	float hr;
	float rate;
	
	Consult(){
		
	}
	
	Consult(int id, String name, float hr, float rate){
		super(id,name);
		this.hr=hr;
		this.rate=rate;
	}
	
	
	void cal() {
		
		salary=hr*rate;
		
	}
	
	
	void print() {
		
		super.print();
		System.out.println("The name of hours  are " +hr);
		System.out.println("The rate per hour is " +rate);
	}

}
