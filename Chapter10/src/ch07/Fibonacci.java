package ch07;

public class Fibonacci {
	
	int[] values;
	int number;
	
	public Fibonacci(int number) {
		this.number = number;
		values = new int[number];
	}
	
	public int fibaonacciRecur(int n) {
		
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		return fibaonacciRecur(n-1) + fibaonacciRecur(n-2);
	}
	
	public int fibonacciIter(int n) {
		
		int ppre = 0;
		int pre = 1; 
		
		int current = 0;
		
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		for(int i = 2; i<=n; i++ ) {
			
			current = ppre + pre;
			ppre = pre;
			pre = current;
			
		}
		
		return current;
		
	}
	
	public int fibonacciMem(int n) {
		
		values[0] = 0;
		values[1] = 1;
		
		int result = 0;
		
		if( n == 0) return values[0];
		
		if( n == 1) return values[1];
		
		for(int i=2; i<=n; i++) {
			
			result = values[i-1] + values[i-2];
			
			if( values[i] == 0) {
				values[i] = result;
			}
		}
 		
		return result;
	}
	

	public static void main(String[] args) {

		Fibonacci fib = new Fibonacci(100);
		
		int result = fib.fibaonacciRecur(10);
		System.out.println(result);
		
		result = fib.fibonacciIter(10);
		System.out.println(result);
		
		result = fib.fibonacciMem(10);
		System.out.println(result);
	}

}
