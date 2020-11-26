package method;

public class MethodTest {
	
	public static void main(String[] args) {
		System.out.println("cm\u00B3");
		//add();
		//area(10,8);
		
		int result = sumOf1To100nos();
		System.out.println("Sum of 1 to 100 = "+result);
		
		//int gv = findGreatestValue(80, 130);
		System.out.println("Big value = "+findGreatestValue(80, 130));
	}
	
 //1. no return_type with no arguments
	static void add() {
		
		int a = 500;
		int b = 300;
		
		int s = a +b;
		System.out.println(s);
	}
	
	//2.no return_type with arguments
	static void  area(int l, int b) {
		
		int ar = l * b;
		System.out.println(ar);
	}
	
	//3. return_type with no arguments
	static int sumOf1To100nos() {
		 
		 int sum =0;
		 
		 for(int i=1; i<=100;i++) {
			 sum+=i;
		 }
		 
		 return sum;
	 }
	
	//4. return_type with arguments
	static int findGreatestValue(int x, int y) {
		
		if(x>y)
			return x;
		else
		   return y;
	}

}
