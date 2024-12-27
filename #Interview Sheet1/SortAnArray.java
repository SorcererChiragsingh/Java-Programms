// Q10.How do you sort an array in Java?
// Interview Sheet 1 Question's

// Easy
// T.C = o(n)
// S.C = o(n)

/* 
Explanation:- The Arrays utility class has many overloaded sort() methods to sort primitive and to object arrays. 
If you are sorting a primitive array in the natural order, then you can use the Arrays.sort() method, as shown in the following example:
*/


public class SortAnArray
{
    public static void main(String[] args)
    {
        int[] array = {1, 2, 3, -1, -2, 4};

        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
    }
}

/*
However, if you want to sort an array of objects, 
then the object must implement the Comparable interface. If you want to specify the sorting criteria, then you can pass the Comparator for the sorting logic.
 */