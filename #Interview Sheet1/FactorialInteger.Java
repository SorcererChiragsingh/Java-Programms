// Q12.How can you find the factorial of an integer in Java?
// Interview Sheet 1 Question's

// Easy
// T.C = o(n)
// S.C = o(n)

/* 
Explanation:-  The factorial of an integer is calculated by multiplying all the numbers from 1 to the given number:

F(n) = F(1)*F(2)...F(n-1)*F(n)
*/

// With the help of recursion, we can find the factorial of an integer in Java. The following code demonstrates how to find the factorial of an integer using recursion:
public class FactorialInteger 
{
    public static long factorial(int n) 
    {
        if (n == 0 || n == 1)
            return 1;
        return n * factorial(n - 1);
    }

    public static void main(String[] args) 
    {
        int number = 5; // Change this number to test
        System.out.println("Factorial of " + number + " is: " + factorial(number));
    }
}


/*

 */