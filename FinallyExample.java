public class FinallyExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 0; // will throw exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        } finally {
            System.out.println("This message always executes.");
        }
    }
}
