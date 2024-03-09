package store;

public class Admin extends AbstractStoreEmployee {
    private double bonusRate;
    private double salesDone;
    private double netPayment;

    public Admin(double numberOfHoursWorked, double hourlyRate, String storeDetails, double basePay,
            String AdminName, double salesDone) {
        super(numberOfHoursWorked, hourlyRate, storeDetails, basePay, AdminName);
        this.salesDone = salesDone;
    }

    public double getNetPayment() {
        return netPayment;
    }

    public void setNetPayment(double netPayment) {
        this.netPayment = netPayment;
    }

    @Override
    public double calculatePay() {
        if (salesDone > 20000) {
            bonusRate = 15.00;
        } else if (salesDone > 5000 && salesDone <= 20000) {
            bonusRate = 10.00;
        } else {
            bonusRate = 1;
        }

        return (super.getNumberOfHoursWorked() * super.getHourlyRate()
                + super.getBasePay()) * (1 + bonusRate / 100);
    }

    @Override
    public double calculateNetPayment(double grossPayment) {
        double netPayment = grossPayment * (1 - TAX);
        return netPayment;
    }

    @Override
    public boolean checkPromotionEligibility() {
        if (calculatePay() > 3000.0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean checkFiredEligibility() {
        if (calculatePay() < 0.0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double calculateTax(double earnings) {
        return earnings * 0.18; // tarif pajak 18%
    }

}
