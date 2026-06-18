class mobile {
    String brand;
    String model;
    double price;
    mobile(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }
    mobile(String b, String m) {
        brand = b;
        model = m;
        price = 10000; 
    }
    void displaymobile() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("---");
    }
    public static void main(String[] args) {
        mobile m1 = new mobile("Apple", "iPhone 15", 120000);
        mobile m2 = new mobile("Samsung", "Galaxy M56");
        m1.displaymobile();
        m2.displaymobile();
    }
}