public class Que6 {
    public static void main(String[] args) {
        try {
            int a = 110, b = 0;
            int result = a / b; // causes ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        }
    }
}
