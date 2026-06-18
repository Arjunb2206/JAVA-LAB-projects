import java.util.Scanner;

public class naturalnum {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements to print :");
        int a = sc.nextInt();

        for (int i = 1; i <=a; i++) {
        System.out.println(" natural number are = " + i +"\t");
        }
    }
}
