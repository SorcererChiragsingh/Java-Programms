// Java T point:- https://www.javatpoint.com/fibonacci-series-in-java
// Java T point Question no. 1
// Java Basic Question
// Solution:- https://www.javatpoint.com/fibonacci-series-in-java

// Fibonacci Series in Java without using recursion
 // JavaT Point Q1 :- Fibonacci Series in Java without using recursion
class FibonacciExample1
{  
    public static void main(String args[])  
    {    
     int n1=0,n2=1,n3,i,count=10;    
     System.out.print(n1+" "+n2);//printing 0 and 1    
        
     for(i=2;i<count;++i)//loop starts from 2 because 0 and 1 are already printed    
     {    
      n3=n1+n2;    
      System.out.print(" "+n3);    
      n1=n2;    
      n2=n3;    
     }    
      
    }
}  

