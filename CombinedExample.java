import java.util.Scanner;

public class CombinedExample {
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 20, 25};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array index: ");
        int index = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        try {
            int result = arr[index] / divisor;
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid index.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero.");
        }
    }
}
