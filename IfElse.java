import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("enter the number : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b ;
        System.out.println("sum is : " + c);
        if(a>b)
            System.out.println("a is greater");
        else
            System.out.println("b is greater");
    }

    
}
