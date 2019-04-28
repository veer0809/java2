package empp;

public class Perm extends Employee{
	
	float basic;
	float hra;
	float da;
	
	
	Perm(){
		
	}
	
	Perm(int id, String name, float basic){
		super(id,name);
		this.basic=basic;
	}
	
	void cal() {
		
		hra=0.35f*basic;
		da=0.15f*basic;
		salary=basic+da+hra;
		
	}
	
	
	void print() {
		super.print();
		System.out.println("The basic salary of employee is " +basic);
	}

}
