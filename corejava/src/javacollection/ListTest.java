package javacollection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
	
	public static void main(String[] args) {
		
		//List<String> list = new ArrayList<>();
		List<String> list = new LinkedList<>();
		
		list.add("nepal");
		list.add("japan");
		list.add("China");
		list.add("india");
		
		//list.remove(2);
		list.remove("japan");
		
		 for(String s : list) {
			 System.out.println(s);
		 }
		 
		 //create userlist 
		 List<User> ulist = new ArrayList<>();
		 
		 ulist.add(new User(222, "Ram", "423"));
		 ulist.add(new User(88, "test", "test999"));
		 ulist.add(new User(999, "admin", "admin"));
		 
		 for(User u : ulist) {
			 System.out.println(u);
		 }
		 
		
	}

}
