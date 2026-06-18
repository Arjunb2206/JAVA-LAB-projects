class vehicle01 {
void start(){
    System.out.println("vechile starts and move forward ");  
}  
}

class car extends vehicle01{
    void start(){
        System.out.println("car started and moving ");
    }
}

class bike extends vehicle01{
    void start(){
        System.out.println("bike started and moving forward ");
    }
}

class transport {
    public static void main(String[] args) {
        vehicle01 v1 =new vehicle01();
        car c1 =new car();
        bike b1 =new bike();
        v1.start();
        c1.start();
        b1.start();  
    }
}
