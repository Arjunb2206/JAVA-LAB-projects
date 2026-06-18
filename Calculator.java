import java.util.Scanner;

public class Calculator {
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("enter two number :");
        int a =sc.nextInt();
        int b =sc.nextInt();
     System.out.println("enter : \n 1: add\n 2:subtract\n 3:multiply\n 4:divide\n 5:square\n 6:mod\n 7:exit");
     int i=sc.nextInt();
     switch (i) {
        case 1:
             int c= a+b;
             System.out.println("add :" + c);
             break;
        case 2:
            c= a-b;
             System.out.println("subtract :" + c);
             break;
        case 3:
            c= a*b;
             System.out.println("multiply :" + c);
             break;
        case 4:
            c= a/b;
             System.out.println("divide :" + c);
             break;
        case 5:
             Double d= Math.pow(a,2);
            Double e = Math.pow(b,2);

             System.out.println("squre of a :" + d);
             System.out.println("squre of b :" + e);
             break;
        case 6:
            c=a%b;
             System.out.println("mod :" + c);
             break;
         default:
            System.out.println("exit:" );
            
     }
}
}
