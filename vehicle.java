
import java.util.Scanner;

class vehicle {
    private String brand;
    protected int speed ;
    String fueltype;
vehicle(){
System.out.println("the vechile details are :");
}
vehicle(String s){
 brand =s ;
    }
void setdetails(int n,String m){
speed =n;
fueltype =m ;
}
void displaydetails(){
System.out.println("vehicle brand :"+brand);
System.out.println("speed :"+speed);
System.out.println("fueltype :"+fueltype);
}
}
class main2{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s ;
    String m ;
    int n ;

    System.out.println("enter brand :");
    s = sc.next();
    System.out.println("enter speed :");
    n = sc.nextInt();
    System.out.println("enter fueltype :");
    m = sc.next();
    vehicle v = new vehicle();
    vehicle v1 =new vehicle(s);
    v1.setdetails(n, m);
    v1.displaydetails();
}
}