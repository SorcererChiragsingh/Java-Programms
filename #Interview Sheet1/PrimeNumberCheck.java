// Q4.Write a Java program to check if the given number is a prime number?
// Interview Sheet 1 Question's
// 

// Easy 
// T.C = o(n)
// S.C = o(n)

/* 
Explanation:-

You can write a program to divide the given number n, by a number from 2 to n/2 and check the remainder. 
If the remainder is 0, then it’s not a prime number. The following example code shows one way to check if a given number is a Prime number:
*/
public class PrimeNumberCheck 
{
    public static void main(String[] args) 
    {
		System.out.println(isPrime(19)); // true
		System.out.println(isPrime(49)); // false
	}

	public static boolean isPrime(int n) 
    {
		if (n == 0 || n == 1) 
        {
			return false;
		}
		if (n == 2) 
        {
			return true;
		}
		for (int i = 2; i <= n / 2; i++) 
        {
			if (n % i == 0) 
            {
				return false;
			}
		}

		return true;
	}

}
