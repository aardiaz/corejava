package controlstm;

public class IfTest2 {
	
	public static void main(String[] args) {
		
		int salary  = 5000;
		
		if(salary < 20000) {
			salary =  salary + 500;
		}
		
		System.out.println("Total Salary = "+salary);
	}

}
