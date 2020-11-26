package aggregation;

public class TestAggregation {
	
	public static void main(String[] args) {
		
		Car c = new Car();
		c.setModel("BYX50");
		c.setColor("Blue");
		c.setPrice(9800000);
		c.setCc(2000);
		c.setCompany("TATA");
		
		Employee  emp = new Employee();
		
		emp.setId(666);
		emp.setName("Milan");
		emp.setPhone("98337434");
		emp.setSalary(80000);
		emp.setCar(c);
		
		System.out.println("Id  = "+emp.getId());
		System.out.println("Name = "+emp.getName());
		System.out.println("==== car info ======");
		System.out.println("Model  = "+emp.getCar().getModel());
		System.out.println("price  = "+emp.getCar().getPrice());
		
	}

}
