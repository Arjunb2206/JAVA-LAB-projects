public class Student {
    String name;
    int age;
    String program;

    void setdetail(String n,int a,String p) {
        name = n;
        age = a;
        program = p;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        System.out.println("program: " + program);
        System.out.println("-------------\t");
    }
}

class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setdetail("BHARGAV",19,"B.TECH(CSE)");
        s2.setdetail("ADITHYA",20,"B.TECH(AIML)");
        s3.setdetail("BHARATH",19,"B.TECH(CSE)");

        s1.display();
        s2.display();
        s3.display();
    }
}