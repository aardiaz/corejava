package array;

public class ArrayAsArguments {
	
	/*
	 *   void sum(int x,int y, int z, int p,int t.........){
	 *   
	 *   
	 *   }
	 *   
	 *   void sum(int[] data){
	 *   
	 *   }
	 *   
	 */
	
	public static void main(String[] args) {
	
		 int  data[] = {20,40,58,90,17,28,44,98,5,67,19,30};
		
		findSmallestValue(data);
		
	}
	
	
	static void findSmallestValue(int value[]) {
		
		int sv = value[0];
		
		for(int x : value) {
			if(sv > x)
				sv =x;
		}
		
		System.out.println("Smallest value = "+sv);
		
	}
	
	

}
