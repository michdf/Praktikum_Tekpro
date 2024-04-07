package listing8_3;

public class Employee {
    private String name;
    private double salary;
    private double bonus;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.bonus = 0;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
