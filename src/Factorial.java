import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Factorial {
    public static BigInteger getFactorial(BigInteger inputNum){
        if(inputNum.compareTo(BigInteger.ZERO)<0)
            throw new InputMismatchException();
        if(inputNum.equals(BigInteger.ONE) || inputNum.equals(BigInteger.ZERO)){
            return BigInteger.ONE;
        }
        BigInteger factorial = BigInteger.ONE;
        while(inputNum.compareTo(BigInteger.ONE) > 0){
            factorial = factorial.multiply(inputNum);
            inputNum = inputNum.subtract(BigInteger.ONE);
        }
        return factorial;
    }

    public static void main(String[] args) {
        System.out.print("Enter the number to find its factorial : ");
        try(Scanner sc = new Scanner(System.in)){
            BigInteger inputNum = sc.nextBigInteger();
            BigInteger factorial = getFactorial(inputNum);
            System.out.println("The factorial of " + inputNum + " is " + factorial);
        }catch(InputMismatchException e){
            System.out.println("Please enter positive numbers only.");
        }
    }
}
