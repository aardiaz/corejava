package looping;

public class ForTest2 {
	
	public static void main(String[] args) {
		
		int esum = 0;
		int osum = 0;
		
		for(int i=1; i<=100; i++) {
			
			  if(i%2==0) {
				  esum = esum+ i;
			  }else {
				  osum= osum + i;
			  }
			//System.out.println(i);
			//s = s+i;
		}
		
		System.out.println("Sum of even no =  "+esum);
		System.out.println("Sum of odd no = "+"+ "+osum);
		System.out.println("=======================");
		System.out.println("Total sum = "+(esum +osum));
		
		
		
		
		
	}

}
