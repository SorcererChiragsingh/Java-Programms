// Java T point:- https://www.javatpoint.com/prime-number-program-in-java
// Java T point Question no. 2
// Java Basic Question
// Solution:- https://www.javatpoint.com/prime-number-program-in-java

// The method where number is not predefined. Here, user has to put the number to check if the number is prime.
// JavaT Point Q2 :- Prime Number Program in Java.

import java.util.Scanner;  
  
public class PrimeExample1 
{  
  
   public static void main(String[] args) 
   {  
       Scanner s = new Scanner(System.in);  
       System.out.print("Enter a number : ");  
       int n = s.nextInt();  
       if (isPrime(n)) 
       {  
           System.out.println(n + " is a prime number");  
       } else 
       {  
           System.out.println(n + " is not a prime number");  
       }  
   }  
   public static boolean isPrime(int n) 
   {  
       if (n <= 1) 
       {  
           return false;  
       }  
       for (int i = 2; i < Math.sqrt(n); i++) 
       {  
           if (n % i == 0) 
           {  
               return false;  
           }  
       }  
       return true;  
   }  
}  