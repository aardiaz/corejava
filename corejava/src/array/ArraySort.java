package array;

import java.util.Arrays;

public class ArraySort {
	
	public static void main(String[] args) {
		
		int data[] = {30,50,12,98,67,49,87,10,39};
		Arrays.sort(data);
		
		for(int x : data) {
			System.out.println(x);
		}
		
		System.out.println("===reverse order===");
		for(int i=data.length-1; i>=0; i--) {
			System.out.println(data[i]);
		}
		
		
	}

}
