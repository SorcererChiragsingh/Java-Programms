// Q6.How do you check if a list of integers contains only odd numbers in Java?
// Interview Sheet 1 Question's

// Easy
// T.C = o(n)
// S.C = o(n)

/* 
Explanation:- You can use a for loop and check whether each element is odd:
*/
import java.util.List;
public class OnlyOddNumbers 
{
    public static boolean onlyOddNumbers(List<Integer> list) 
    {
        for (int i : list) 
        {
            if (i % 2 == 0) // If any number is even, return false
                return false;
        }
    
        return true;// All numbers are odd
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////////

/**
If the list is large, you can use parallel stream for faster processing, as shown in the following example code:

public static boolean onlyOddNumbers(List<Integer> list) 
{
	return list
			.parallelStream() // parallel stream for faster processing
			.anyMatch(x -> x % 2 != 0); // return as soon as any elements match the condition
}
*/