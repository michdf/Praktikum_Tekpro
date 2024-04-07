package listing8_3;

public class Manager extends Employee{
    private int year;
    private int month;
    private int day;

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary);
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public void setBonus(double bonus) {
        super.setBonus(bonus);
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }
}
