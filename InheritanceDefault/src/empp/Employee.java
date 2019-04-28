package empp;

public class Employee {
	
	int id;
	String name;
	float salary;
	
	
	Employee(){
		
	}
	
	Employee( int id,String name){
		this.id=id;
		this.name=name;
	}
	
	void cal() {
		
	}
	
	void print() {
		
		
		System.out.println("The id of employee is " +id);
		System.out.println("The name of employee is " +name);
		System.out.println("The salary of employee is " +salary);
	}


}
