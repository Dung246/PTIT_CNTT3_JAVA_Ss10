package BTVN;

import java.util.*;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return name + " - " + price;
    }
}

public class b6 {
    public static void main(String[] args) {

        List<Product> list = new ArrayList<>();
        list.add(new Product("Chuột", 200));
        list.add(new Product("Laptop", 1500));
        list.add(new Product("Bàn phím", 500));
        list.add(new Product("Tai nghe", 300));

        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product o1, Product o2) {
                return Double.compare(o1.price, o2.price);
            }
        });

        System.out.println("Sắp xếp theo giá tăng dần (Anonymous Class):");
        for (Product p : list) {
            System.out.println(p);
        }

        Collections.sort(list, (a, b) -> a.name.compareTo(b.name));

        System.out.println("\nSắp xếp theo tên A-Z (Lambda):");
        list.forEach(System.out::println);
    }
}
