/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package store;

/**
 * This is the Store interface file.
 *
 * @author Goteti Santosh Ravi Teja
 */
public interface Store {

    /**
     * It is a constant field value.
     */
    static final double COMMISSION_RATE = 0.10;
    

    /**
     * It is a constant field value.
     */
    static final double TAX = 0.14;

    /**
     *
     * @return 
     * @return- This method returns the calculateCommission.
     */
    public double calculateCommission();

    /**
     *
     * @param storeSales - The parameter storeSales is passed.
     * @return - This method returns the remaining store revenue.
     */
    public double calculateRemainingStoreRevenue(double storeSales);

    /**
     * This method is used to calculate the net payment for an employee after deducting taxes.
     * @param grossPayment The gross payment before tax deduction.
     * @return The net payment after tax deduction.
     */
    public double calculateNetPayment(double grossPayment);
}
