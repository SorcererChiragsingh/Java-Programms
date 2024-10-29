// Q5. Write a Java program to print a Fibonacci sequence using recursion.
// Interview Sheet 1 Question's
// 

// Easy 
// T.C = o(n)
// S.C = o(n)

/* 
Explanation:-

A Fibonacci sequence is one in which each number is the sum of the two previous numbers. 
In this example, the sequence begins with 0 and 1. The following example code shows how to use a for loop to print a Fibonacci sequence:
*/

public class PrintFibonacciUsingRecursion 
{

	public static void printFibonacciSequence(int count) 
    {
		int a = 0;
		int b = 1;
		int c = 1;

		for (int i = 1; i <= count; i++) 
        {
			System.out.print(a + ", ");

            a = b;
			b = c;
			c = a + b;
		}
	}

	public static void main(String[] args) 
    {
    	printFibonacciSequence(10);
	}

}

/**
The following example class shows how to use recursion to calculate a Fibonacci sequence that is 10 numbers long:

public class PrintFibonacciUsingRecursion  {

    public static int fibonacci(int count) {
		if (count <= 1)
			return count;

		return fibonacci(count - 1) + fibonacci(count - 2);
	}

	public static void main(String args[]) {
    	int seqLength = 10;

    	System.out.print("A Fibonacci sequence of " + seqLength + " numbers: ");

    	for (int i = 0; i < seqLength; i++) {
      	    System.out.print(fibonacci(i) + " ");
    	}
  	}

}
*/
