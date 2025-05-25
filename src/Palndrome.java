import java.util.InputMismatchException;
import java.util.Scanner;

public class Palndrome {
    //function to check for palindrome
    public static boolean checkIfPalindrome(int inputNum){
        if(inputNum<0)
            throw new InputMismatchException();
        StringBuilder numString = new StringBuilder(String.valueOf(inputNum));
        StringBuilder reversedNumString = new StringBuilder(String.valueOf(inputNum)).reverse();
        return numString.compareTo(reversedNumString) == 0;
    }

    public static void main(String[] args) {
        System.out.print("Enter a number to check if its palindrome: ");
        try(Scanner sc = new Scanner(System.in)) {
            int inputNum = sc.nextInt();
            System.out.printf("%d is %s palindrome",inputNum,checkIfPalindrome(inputNum)?"a":"not a");
        }catch(InputMismatchException e){
            System.out.println("Please enter positive numbers only");
        }
    }
}
