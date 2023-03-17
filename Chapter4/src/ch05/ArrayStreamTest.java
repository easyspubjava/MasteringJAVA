package ch05;

import java.util.Arrays;

public class ArrayStreamTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		int sumVal = Arrays.stream(arr).sum();
		System.out.println(sumVal);
		long count = Arrays.stream(arr).count();
		System.out.println(count);
		
		int sum = Arrays.stream(arr).reduce(0, (a, b)->a+b);
		System.out.println(sum);
		
	}

}
