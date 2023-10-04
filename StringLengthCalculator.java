import java.lang.String;
public class StringLengthCalculator {
    public static int CalculatingStringLength(String s){

        int size=0;                  // Initialize a variable to store the length of the string
        for(char c: s.toCharArray()){   //Using CharArray function to convert string into character function
            size++;                   // Increment the size variable
        }

        return size;                // Return the calculated length of the string
    }
    public static void main(String[] args) {
        String s="Welcome to Clarivate!";      // Example usage
        System.out.println("Length of the String is " + CalculatingStringLength(s));
    }
}
