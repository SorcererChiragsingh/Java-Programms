// Q1.How do you reverse a string in Java?
// Interview Sheet 1 Question's

// Easy
// T.C = o(n)
// S.C = o(n)

/* 
Explanation:-

There is no reverse() utility method in the String class. However, you can create a character array from the string and then iterate it from the end to the start. 
You can append the characters to a string builder and finally return the reversed string.
*/
public class ReverseString 
{
    public static void main(String[] args) {
		String str = "123";

		System.out.println(reverse(str));
	}

	public static String reverse(String in) {
		if (in == null)
			throw new IllegalArgumentException("Null is not valid input");

		StringBuilder out = new StringBuilder(); // StringBuilder out = new StringBuilder();: A StringBuilder object out is created, which will be used to construct the reversed string.

		char[] chars = in.toCharArray(); // char[] chars = in.toCharArray();: The input string in is converted to a character array chars to allow iterating through each character.

		for (int i = chars.length - 1; i >= 0; i--)
			out.append(chars[i]); // out.append(chars[i]);: Adds each character to the out object.

		return out.toString();
	}
}
