import java.util.Scanner;

public class Datatypes {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int i;
        float f;
        double d;
        char c;
        boolean b;
        String s;
        System.out.println("enter int value:");
        i =sc.nextInt();
        System.out.println("enter float value:");
        f =sc.nextFloat();
        System.out.println("enter double value:");
        d =sc.nextDouble();
        System.out.println("enter char value:");
        c =sc.next().charAt(0);
        System.out.println("enter string value:");
        s =sc.next();
        System.out.println("enter boolean value:");
        b =sc.nextBoolean();
        System.out.println("int value is :"+i);
        System.out.println("float value is :"+f);
        System.out.println("double value is :"+d);
        System.out.println("char value is :"+c);
        System.out.println("string  value is :"+s);
        System.out.println("boolean value is :"+b);
    }
}
