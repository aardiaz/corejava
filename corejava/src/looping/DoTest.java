package looping;

public class DoTest {
/*
 *  do{
 *  
 *     //statements
 *     //inc/dec
 *     
 *  }while(condition);
 */
	
	
	
	public static void main(String[] args) {
		
		/*
		 *     8 ** 1 = 8
		 *     8 * 2 = 16
		 *     ........
		 *     .............
		 *     8 * 10 = 80
		 *     
		 */
		
		int n = 44;
		int i = 1;
		
		do {
			
			System.out.println(n+" * "+i+" = "+(n*i));
			
			i++;
		}while(i<=100);
		
		
		
		
	} 
	
}
