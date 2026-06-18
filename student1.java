class Student1{
    static int count = 0;  
    String name;

    
    Student1(String name){
        this.name = name;
        count++;
    }
    static void displayCount() {
        System.out.println("Total students created are: " + count);
    }
}
 class variable{
public static void main(String[] args) {
    Student1 s1 = new Student1("Arjun");
    Student1 s2 = new Student1("Adithya");
    Student1 s3 = new Student1("Bharath");
    Student1 s4 = new Student1("raj");
    Student1.displayCount();
}
}