class Employees{
    private String name;
    private double salary;
    private static int totalEmployees = 0;
    public Employees(String n, double s) {
        name = n;
       salary = s;
        totalEmployees++;
    }
    public void displayDetails() {
        System.out.println("Name: " + name + ", Salary: " + salary);
    }
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
}

class Employee1{
    public static void main(String[] args) {
        Employees emp1 = new Employees("Arun", 50000);
        Employees emp2 = new Employees("ram", 60000);
        Employees emp3 = new Employees("surya", 70000);
        emp1.displayDetails();
        emp2.displayDetails();
        emp3.displayDetails();
        Employees.displayTotalEmployees();
    }
}