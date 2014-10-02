/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discountstrategy;

/**
 *
 * @author mdufek1
 */
public class NoDiscount implements DiscountStrategy{

    public static final String DISCOUNT_TYPE = "No Discount";
    public final double discountAmount = 0;
    public int qty;
    private double productPrice;
    private double calculatedDiscount;

    
    
    @Override
    public double discount(int qty, double productPrice) {
        if(qty<1){
            throw new IllegalArgumentException("Quantity must be 1 or greater");
        }
       else if(productPrice<0){
            throw new IllegalArgumentException("productPrice must be greater than 0");
        }
       else{
      calculatedDiscount = 0;
       return calculatedDiscount;
       }
    }

    @Override
    public String getDISCOUNT_TYPE() {
        return DISCOUNT_TYPE;
    }

    public double getDiscountAmount() {
        return discountAmount;
    }

    @Override
    public void setDiscountAmount(double discountAmount) {
       
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
