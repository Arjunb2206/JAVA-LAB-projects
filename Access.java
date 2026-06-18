class Person {
    private String name;       
    int age;                 
    protected String address;  
    public String email;      

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    protected void showAddress() {
        System.out.println("Address: " + address);
    }
    void showAge() {
        System.out.println("Age: " + age);
    }
    public void showEmail() {
        System.out.println("Email: " + email);
    }
}

public class Access {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Arjun");
        System.out.println("Name: " + p.getName());
        p.age = 20;
        p.showAge();
        p.address = "Ballari";
        p.showAddress();
        p.email = "arjun22gmail.com";
        p.showEmail();
    }
}