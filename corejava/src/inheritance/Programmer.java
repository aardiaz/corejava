package inheritance;

public class Programmer extends Employee{

	String planguage;
	String project;
	int bonus;
	
	
	public static void main(String[] args) {
		
		Programmer  p1 = new Programmer();
		
		p1.id = 903;
		p1.name = "Sumit";
		p1.phone = "9348348343";
		p1.salary = 200000;
		p1.bonus = 20000;
		p1.phone = "java";
		p1.project = "CMS";
		
		System.out.println(p1.id+p1.name+p1.salary);
	}
}
