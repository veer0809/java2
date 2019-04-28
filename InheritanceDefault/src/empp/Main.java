package empp;

public class Main {

	public static void main(String[] args) {
		Perm p =new Perm(5, "Veer", 50000);
		p.cal();
		p.print();
		
		
		
		Consult c = new Consult(2, "Yug", 20 , 2000);
		c.cal();
		c.print();

	}

}
