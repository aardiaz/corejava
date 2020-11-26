package array;

public class MultiDArray {
	/*
	 * data_type  array_name[][] = new data_type[row-size][col-size];
	 * 
	 */

	public static void main(String[] args) {
		
		int mat[][] = new int[2][2];
		
		//write data in multiDArray
		for(int i=0;i<2;i++) {
			
			for(int j=0;j<2;j++) {
				
				mat[i][j] = 20;
			}
		}
		
		//read 
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
	}
}
