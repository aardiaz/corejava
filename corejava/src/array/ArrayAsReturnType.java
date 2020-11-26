package array;

public class ArrayAsReturnType {
	
	/*
	 *    
	 *    int si(){
	 *    
	 *    
	 *    return 0;
	 *    
	 *    }
	 *    
	 *    int[]  findOddnos(){
	 *    
	 *    
	 *    return array;
	 *    }
	 *    
	 */
	
	public static void main(String[] args) {
		
		int[]  result = getOddNosFrom1To100();
		
		for(int od : result) {
			System.out.println(od);
		}
		
	}
	
	
	static int[] getOddNosFrom1To100(){
		
		int[] oddnos = new int[50];
		
		int j =0;
		
		  for(int i=1;i<=100; i++) {
			  
			  if(i%2 != 0) {
				  //System.out.println(i);
				  oddnos[j] = i;
				  j++;
			  }
		  }
		
		return oddnos;
	}
	
	
	

}
