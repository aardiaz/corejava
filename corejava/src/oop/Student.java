package oop;

public class Student {
	
	  String fname;
	  String lname;
	  String college;
	  int age;
	  String phone;
	  int rollno; 
	  
	  void printStudentInfo() {
		  
		  System.out.println("FirstName = "+fname);
		  System.out.println("LastName = "+lname);
		  System.out.println("College = "+college);
		  System.out.println("Age = "+age);
		  System.out.println("Phone = "+phone);
		  System.out.println("RollNo = "+rollno);
	  }
	  
	  public static void main(String[] args) {
		  // 's'  is object of Student class
		
		 
		  Student s = new Student();
		
		s.fname = "Hari";
		s.lname = "Lama";
		s.age = 20;
		s.college ="NCC";
		s.rollno = 8901;
		s.phone = "9837336533";
		
		s.printStudentInfo();
		
	}
	   

}
