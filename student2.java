class Student2{
    private int id;
    private String name;
    private String course;

    public Student2(int id, String name, String course) {
        this.id = id;
        this.name = name;
        this.course = course;
    }

    public void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}


class Studentintz{
    public static Student2 createStudent() {
        Student2 s = new Student2(101, "Arun", "Computer Science");
        return s;
    }
    public static void main(String[] args) {
        Student2 s1 = createStudent();
        s1.display();
    }
}
