package looping;

public class EnhanceForTest {
	
	/*
	 *   for(data_type  var : collection){
	 *   
	 *      //statements
	 *      
	 *   }
	 */
	
	public static void main(String[] args) {
		
		int  values[] = {20,48,90,37,87,62,7,46,29,44,77,10};
		
		int sum = 0;
		
		for(int x : values) {
			sum+=x;
			
		}
		System.out.println(sum);
		
		
		
		
	}
	

}
