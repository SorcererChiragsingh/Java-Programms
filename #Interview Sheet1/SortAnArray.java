// Q10.How do you sort an array in Java?
// Interview Sheet 1 Question's

// Easy
// T.C = O(n log n)
// S.C = O(log n)

/* 
Explanation:- The Arrays utility class has many overloaded sort() methods to sort primitive and to object arrays. 
If you are sorting a primitive array in the natural order, then you can use the Arrays.sort() method, as shown in the following example:
*/


import java.util.Arrays;

public class Main {
    public static void main(String[] args) 
    {
        // Create an instance of the SortAnArray class
        SortAnArray sortAnArray = new SortAnArray();
        sortAnArray.sortAndPrintArray();
    }
}

class SortAnArray 
{
    public void sortAndPrintArray() 
    {
        int[] array = {1, 2, 3, -1, -2, 4};

        // Sort the array
        Arrays.sort(array);

        // Print the sorted array
        System.out.println(Arrays.toString(array));
    }
}


/*
However, if you want to sort an array of objects, 
then the object must implement the Comparable interface. If you want to specify the sorting criteria, then you can pass the Comparator for the sorting logic.
 */