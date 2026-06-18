class Product {
    String productName;
    double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    void display() {
        System.out.println("Product: " + productName + ", Price: " + price);
    }
}

class ProductDemo {
    static Product createProduct() {
        return new Product("Laptop", 75000.00);
    }

    public static void main(String[] args) {
        Product p = createProduct();
        p.display();
    }
}
