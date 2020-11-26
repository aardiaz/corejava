package javacollection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortTest {
	
	public static void main(String[] args) {
		
		List<Integer>  list = Arrays.asList(20,49,58,29,9,67,92,17,12,90,4,67);
		
		Collections.sort(list);
		System.out.println(list);
		Collections.sort(list,Collections.reverseOrder());
		System.out.println(list);
	}
}
