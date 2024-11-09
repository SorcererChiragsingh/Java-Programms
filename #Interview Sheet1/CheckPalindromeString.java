// Q7.How do you check whether a string is a palindrome in Java?
// Interview Sheet 1 Question's

// Easy
// T.C = o(n)
// S.C = o(n)

/* 
Explanation:- A palindrome string is the same string backwards or forwards. To check for a palindrome, you can reverse the input string and check if the result is equal to the input. 
The following example code shows how to use the String charAt(int index) method to check for palindrome strings:
*/

public class CheckPalindromeString // class
{
    public static void main(String[] args) 
    {
        CheckPalindromeString palindromeChecker = new CheckPalindromeString(); // Method :- palindromeChecker

        String input = "madam"; // Declares a String variable named input and assigns it the value "madam", which we will check for being a palindrome.
        boolean result = palindromeChecker.isPalindrome(input);

        if (result) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
    public boolean isPalindrome(String input) 
    {
        boolean result = true;
        int length = input.length();

        // Loop to compare characters from both ends
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) // input.charAt(i): Accesses the character at index i from the start of the string. 
            {
                result = false; // Return false immediately if a mismatch is found

                break;
            }
        }

        return result; // Return true if all characters match
    }
}

// input.charAt(length - i - 1): Accesses the character at the corresponding position from the end of the string.
/** 
- if (input.charAt(i) != input.charAt(length - i - 1)): Compares the character at the i-th position from the start with the character at the i-th position from the end. 
If they don’t match, return false, ending the method immediately as we know input is not a palindrome.
- 
*/