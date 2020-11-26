package abstraction;

public class UserServiceImpl implements UserService,EmployeeService{

	@Override
	public void add() {
		
		System.out.println("added success!!");
	}

	@Override
	public void delete() {
		System.out.println("deleted success!!");
	}

}
