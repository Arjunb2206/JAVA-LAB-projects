import java.util.Scanner;

public class Employee {
    String name ;
    int empid;

    public Employee() {
        name ="RAM" ;
        empid= 101;
    }
    public  Employee(String n , int id){
         name = n ;
         empid = id ;
    }

    Employee(Employee e){
        name = e.name ;
        empid = e.empid ;
    }

    void display(){
        System.out.println("Name :"+ name);
        System.out.println("EMPID :"+ empid);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Employee e1 = new Employee();
        Employee e2 = new Employee("adithya", 102);
        Employee e3 = new Employee(e2);
        e1.display();
        e2.display();
        e3.display();
        System.out.println("ENTER name and id of emp :");
        String nm = sc.next();
        int i = sc.nextInt();
        Employee e4 =new Employee(nm , i);
        e4.display();
        sc.close();
    }
}
