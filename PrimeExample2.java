// Java T point:- https://www.javatpoint.com/prime-number-program-in-java
// Java T point Question no. 2
// Java Basic Question
// Solution:- https://www.javatpoint.com/prime-number-program-in-java

// The method where to find prime numbers between two specified numbers.
// JavaT Point Q2 :- Prime Number Program in Java.

import java.util.Scanner;  
public class PrimeExample2 
{  
   public static void main(String[] args) 
   {  
       Scanner s = new Scanner(System.in);  
       System.out.print("Enter the first number : ");  
       int start = s.nextInt();  
       System.out.print("Enter the second number : ");  
       int end = s.nextInt();  
       System.out.println("List of prime numbers between " + start + " and " + end);  
       for (int i = start; i <= end; i++) 
       {  
           if (isPrime(i)) 
           {  
               System.out.println(i);  
           }  
       }  
   }  
   public static boolean isPrime(int n) 
   {  
       if (n <= 1) 
       {  
           return false;  
       }  
       for (int i = 2; i <= Math.sqrt(n); i++) 
       {  
           if (n % i == 0) 
           {  
               return false;  
           }  
       }  
       return true;  
   }  
}  