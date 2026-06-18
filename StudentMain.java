class StudentMain {
    private int id;
    private String name;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    StudentMain(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getDetails() {
        return "[ID :" + id + " , Name :" + name + "]";
    }
}

class StudentDetails {
    public static void main(String[] args) {
        StudentMain s1 = new StudentMain(88, "Yashwanth");
        StudentMain s2 = new StudentMain(90, "Arjun");
        StudentMain s3 = new StudentMain(92, "Bharath");

        System.out.println(s1.getDetails());
        System.out.println(s2.getDetails());
        System.out.println(s3.getDetails());
    }
}
