package BTVN;
import java.util.Scanner;

interface Shape {
    double getArea();
    double getPerimeter();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}

public class b1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập bán kính hình tròn: ");
        double r = sc.nextDouble();
        Circle circle = new Circle(r);

        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        double w = sc.nextDouble();
        System.out.print("Nhập chiều cao hình chữ nhật: ");
        double h = sc.nextDouble();
        Rectangle rect = new Rectangle(w, h);

        System.out.println("\n--- KẾT QUẢ ---");
        System.out.println("Hình tròn:");
        System.out.println("Diện tích = " + circle.getArea());
        System.out.println("Chu vi = " + circle.getPerimeter());

        System.out.println("\nHình chữ nhật:");
        System.out.println("Diện tích = " + rect.getArea());
        System.out.println("Chu vi = " + rect.getPerimeter());

        sc.close();
    }
}
