
public class Perm extends Employee{
	
	float basic;
	float hra;
	float da;
	
	Perm(){
		
	}
	
	void cal(){
		
		hra=0.15f*basic;
		da=0.35f*basic;
		salary=basic+da+hra;
		
	}
	
	void print() {
		super.print();
		System.out.println("The basic salary of employee is  " +basic);
	}

}
