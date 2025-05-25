import java.sql.SQLOutput;
import java.util.Scanner;

public class StringPalindrome {
    public static boolean isPalindrome(String inputString) {
        StringBuilder input = new StringBuilder(inputString);
        String reversed = input.reverse().toString();
        return inputString.equals(reversed);
    }

    public static void main(String[] args) {

        System.out.print("Please enter a string to check palindrome: ");
        try(Scanner scanner = new Scanner(System.in)) {
            String inputString = scanner.next();
            System.out.printf("Input string : %s is %s palindrome",inputString,isPalindrome(inputString)?"a":"not a");
        }catch (Exception e) {
            System.out.println("Please enter string only.");
        }
    }
}
