// Q8. How do you remove spaces from a string in Java?
// Interview Sheet 1 Question's

// Easy
// T.C = o(n)
// S.C = o(n)

/* 
Explanation:- The following example code shows one way to remove spaces from a string using with the Character.isWhitespace() method:
*/

public class RemoveSpacesFromString 
{
    // Method to remove white spaces from a given string
    public String removeWhiteSpaces(String input) 
    {
        if (input == null) 
        {
            throw new IllegalArgumentException("Input cannot be null");
        }

        StringBuilder output = new StringBuilder();
        char[] charArray = input.toCharArray();

        for (char c : charArray) 
        {
            if (!Character.isWhitespace(c)) {
                output.append(c);
            }
        }

        return output.toString();
    }

    // Main method for testing
    public static void main(String[] args) 
    {
        RemoveSpacesFromString remover = new RemoveSpacesFromString();
        String input = "   Java Programming   ";
        String result = remover.removeWhiteSpaces(input);

        System.out.println("Original String: \"" + input + "\"");
        System.out.println("String without spaces: \"" + result + "\"");
    }
}
