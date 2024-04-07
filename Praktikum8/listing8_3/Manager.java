package listing8_3;

import java.time.LocalDate;

public class Manager extends Employee implements Comparable{
    private double bonus;
    public Manager(String name,double bonus, int year, int month, int day) {
        super(name, year, month, day);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
