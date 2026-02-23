package BTVN;

abstract class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public abstract double calculateSalary();

    public void displayInfo() {
        System.out.println("Tên: " + name);
        System.out.println("Lương cơ bản: " + baseSalary);
    }
}

interface BonusCalculator {
    double getBonus();
}

class OfficeStaff extends Employee {

    public OfficeStaff(String name, double baseSalary) {
        super(name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee implements BonusCalculator {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double getBonus() {
        return bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + getBonus();
    }
}

public class b5 {
    public static void main(String[] args) {

        Employee e1 = new OfficeStaff("Lan", 8000);
        Employee e2 = new Manager("Minh", 15000, 5000);

        Employee[] employees = { e1, e2 };

        System.out.println("===== BẢNG LƯƠNG =====");

        for (Employee e : employees) {
            e.displayInfo();

            if (e instanceof BonusCalculator) {
                BonusCalculator b = (BonusCalculator) e;
                System.out.println("Thưởng KPI: " + b.getBonus());
            } else {
                System.out.println("Thưởng KPI: Không có");
            }

            System.out.println("Lương cuối: " + e.calculateSalary());
            System.out.println("----------------------");
        }
    }
}
