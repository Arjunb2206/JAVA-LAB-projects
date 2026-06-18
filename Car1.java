class Car1 {
    String model;
    double price;

    Car1(String model, double price) {
        this.model = model;
        this.price = price;
    }

    void display() {
        System.out.println("Model: " + model + ", Price: " + price);
    }
}

class CarDemo {
    static Car1 createCar() {
        return new Car1("Tesla Model 3", 35000.00);
    }

    public static void main(String[] args) {
        Car1 c = createCar();
        c.display();
    }
}
