class Shape {
    public int area(int a) {
        return a * a;
    }
    public int area(int l, int b) {
        return l * b;
    }
    public double area(double r) {
        return Math.PI * r * r;
    }
    public double area(double bs, double h) {
        return 0.5 * bs * h;
    }
    public double area(double x, double y ,double ht) {
        return  0.5 * (x+y) * ht;
    }
}
public class Shapearea{
    public static void main(String[] args) {
        Shape s = new Shape();
        System.out.println("Square area: " + s.area(5));
        System.out.println("Rectangle area: " + s.area(4, 6));
        System.out.println("Circle area: " + s.area(3.0));
        System.out.println("Triangle area: " + s.area(4.5, 5.0));
        System.out.println("trapezium area: " + s.area(3.0,4.8, 5.0));
    }
}