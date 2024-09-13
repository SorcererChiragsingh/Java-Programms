// Q3.Write a Java program to check if a vowel is present in a string.
// Interview Sheet 1 Question's
// 

// Easy 

// T.C:-
// S.C:- 
public class StringContainsVowels 
{
	public static void main(String[] args) 
    {
		System.out.println(stringContainsVowels("Hello")); // true
		System.out.println(stringContainsVowels("TV")); // false
	}

	public static boolean stringContainsVowels(String input) 
    {
		return input.toLowerCase().matches(".*[aeiou].*");
	}

}