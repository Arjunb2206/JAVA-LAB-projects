
import java.util.Scanner;

class over {
    void display(int x){
        System.out.println("int value are :"+x);
    }
    void display(String s){
        System.out.println("int value are :"+s);
    }

}
class Main1{
public static void main(String[] args) {
Scanner sc =new Scanner(System.in);

over o =new over();
int num;
String s;
System.out.println("enter int value :");
 num =sc.nextInt();
System.out.println("enter string value :");
 s =sc.next();

 o.display(num);
o.display(s);
}
}