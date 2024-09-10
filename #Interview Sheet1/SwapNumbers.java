// Q2.How do you swap two numbers without using a third variable in Java?
// Interview Sheet 1 Question's
// 
public class SwapNumbers 
{
    public static void main(String[] args) 
    {
        int a = 10;
        int b = 20;
    
        System.out.println("a is " + a + " and b is " + b);
    
        b = b + a; // now b is sum of both the numbers
        a = b - a; // b - a = (b + a) - a = b (a is swapped)
        b = b - a; // (b + a) - b = a (b is swapped)
    
        System.out.println("After swapping, a is " + a + " and b is " + b);
    
    }
}
