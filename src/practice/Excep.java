package practice;

import java.util.Arrays;

public class Excep {
    public static void main(String[] args) {
        try {
            int num = 10;
            int result = divide(num, 0);
            System.out.println("Result: " + result);
        }
//        catch (ArithmeticException e) {
//            System.out.println("An error occurred: " + e.getMessage());
//        }
        catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage() + ": " + Arrays.toString(e.getStackTrace()));
        }
    }

    private static int divide(int num, int i) {
        return num / i;
    }
}
