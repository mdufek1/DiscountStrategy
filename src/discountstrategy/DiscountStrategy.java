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
public interface DiscountStrategy {
    public abstract void discount(int qty, double productPrice);
    public abstract String getDISCOUNT_TYPE();
    public abstract double getDiscountAmmount();
    public abstract void setDiscountAmmount(double discountAmmount);
    public abstract double getProductPrice();
    public abstract void setProductPrice(double productPrice);
    public abstract int getQty();
    public abstract void setQty(int qty);
    public abstract double getCalculatedDiscount();
}
