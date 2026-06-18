class Employee01{
    String work(){
        return "Employee working";
    }
}
class Manager extends Employee01{
    String work(){
        return "Manager is working";
    }
}
class Developer extends Employee01{
    String work(){
        return "Developer is working";
    }
}
public class EmployeeMain {
    public static void main(String[] args){
        Employee01 e1 = new Manager();
        Employee01 e2 = new Developer();

        System.out.println(e1.work());
        System.out.println(e2.work());
    }
}