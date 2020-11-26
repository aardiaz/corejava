package statickeyword;

public class Student {
	
	String fname;
	String lname;
    static String collegeName="NCC"; // 8byte
	int rollno;
	
	public void setValue(String fn, String ln, int roll) {
		fname = fn;
		lname= ln;
		rollno = roll;
	}

	void print() {
		System.out.println(fname+lname+collegeName+rollno);
	}
	
	public static void main(String[] args) {
		
		Student  s1 = new Student();
		//s1.fname = "Hari";
		s1.print();
		
		/*
		 *  fname  = 8
		 *  lname  = 8
		 *  rollno = 4
		 *  s1 =>28 bytes
		 */
		
		
	}

}
