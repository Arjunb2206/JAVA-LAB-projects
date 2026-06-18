class fruit{
    void name(){
        System.out.println("name : apple ");
    }
}

class orange extends fruit{
    void name(){
        System.out.println("name : orange");
    }
}

public class Example {
    public static void main(String[] args) {
        orange o1 =new orange();
        o1.name();
    }
}
