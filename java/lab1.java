import java.util.Scanner;
class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }
}

public class lab01{
    static double divide(int numerator, int denominator) throws DivisionByZeroException {
        if (denominator == 0) {
            throw new DivisionByZeroException("Cannot divide by zero!");
        }
        return (double) numerator / denominator;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter numerator and denominator ");
        int numerator = input.nextInt();
        int denominator = input.nextInt()
          try {
            double result = divide(numerator, denominator);
            System.out.println("Result of division: " + result);
        }
        catch (DivisionByZeroException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block executed");
        }
    }
}
