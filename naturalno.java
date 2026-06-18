import java.util.Scanner;

public class naturalno {
         public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of elements to print :");
        int a = sc.nextInt();
        int i= 1;
    while ( i <= a) { 
        System.out.println(" natural number are = " + i +"\t");
        i++;
        } 
    }
}
