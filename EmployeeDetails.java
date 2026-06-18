class Employee02 {
    private int empId;
    private String name;
    private double salary;

    public int getId() {
        return empId;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }

    Employee02(int id, String name, double salary) {
        this.empId = id;
        this.name = name;
        this.salary = salary;
    }
}

public class EmployeeDetails {
    
    static String getDetails(Employee02 e) {
        return "[ID :" + e.getId() + " ,Name :" + e.getName() + " ,Salary :" + e.getSalary() + "]";
    }

    public static void main(String[] args) {
        Employee02 e1 = new Employee02(88, "Yashwanth", 80000);
        Employee02 e2 = new Employee02(90, "Arjun", 80000);
        Employee02 e3 = new Employee02(92, "Bharath", 80000);

        System.out.println(getDetails(e1));
        System.out.println(getDetails(e2));
        System.out.println(getDetails(e3));
    }
}
