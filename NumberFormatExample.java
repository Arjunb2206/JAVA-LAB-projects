import java.util.Scanner;

public class NumberFormatExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String input = sc.next();

        try {
            int num = Integer.parseInt(input);
            System.out.println("Converted number: " + num);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        }
    }
}
