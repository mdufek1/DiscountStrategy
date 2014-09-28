/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Mike
 */
public class FlatDiscount implements DiscountStrategy {
    public static final String DISCOUNT_TYPE = "Flat Discount";
    public double discountAmmount = 1.00;
    public int qty;
    private double productPrice;
    private double calculatedDiscount;

    public FlatDiscount(double discountAmmount) {
        this.discountAmmount = discountAmmount;
    }
    
    
    @Override
    public void discount(int qty, double productPrice) {
      calculatedDiscount = productPrice - (qty * discountAmmount);
    }

    @Override
    public String getDISCOUNT_TYPE() {
        return DISCOUNT_TYPE;
    }

    public double getDiscountAmmount() {
        return discountAmmount;
    }

    @Override
    public void setDiscountAmmount(double discountAmmount) {
        this.discountAmmount = discountAmmount;
    }

    @Override
    public double getProductPrice() {
        return productPrice;
    }

    @Override
    public void setProductPrice(double productPrice) {
       this.productPrice = productPrice;
    }

    @Override
    public int getQty() {
        return qty;
    }

    @Override
    public void setQty(int qty) {
       this.qty = qty;
    }

    @Override
    public double getCalculatedDiscount() {
        return calculatedDiscount;
    }
   



    
}
