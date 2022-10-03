public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciRecursive recursive = new FibonacciRecursive(); //New instance of the Recursive class
		FibonacciIterative iterative = new FibonacciIterative(); // New instance of the Iterative class
		long start1;
		long start2;
		long end1;
		long end2;
		int iter;
		int recur;
		for(int i = 1; i < 15; i += 1) {
		start1 = System.nanoTime();
		iter = iterative.Fibonacci(i);
		end1 = System.nanoTime();
		start2 = System.nanoTime();
		recur = recursive.Fibonacci(i);
		end2 = System.nanoTime();
		System.out.print("For the Fibonacci sequence " + i + " the answer is " + iter + " \n");
		System.out.print("Iterative sequence for " + i + " takes " + (end1 - start1) + " nanoseconds \n");
		System.out.print("Recursice sequence for " + i + " takes " + (end2 - start2) + " nanoseconds \n\n");		
		}
		
	}

}

class FibonacciRecursive { 

	//A method for the Fibonacci sequence the recursive way
	public int Fibonacci(int n) {
		
		if (n==0)
		{
			return 0;
		}
		else if (n == 1)
		{
			return 1;
		}
		else 
		{
			return Fibonacci(n-1) + Fibonacci(n-2);
		}
	}
}


class FibonacciIterative { 
	
	//A method for the Fibonacci sequence the iterative way
	public int Fibonacci(int n) {
		
		int v1 = 0;
		int v2 = 1;
		int v3 = 0;
		
		for (int i = 2; i <= n; i++) 
		{
			v3 = v1+v2;
			v1 = v2;
			v2 = v3;
		}
		
		return v3;
	}
	
}
