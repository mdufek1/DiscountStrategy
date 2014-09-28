package discountstrategy;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mike
 */
public class Product {
    private String productID;
    private String productName;
    private double productPrice;
    private DiscountStrategy[] discounts = new DiscountStrategy[0];
    
    public Product(String productID, String productName, double productPrice) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice; 
    }

    public String getProductID() {
        return productID;
    }

    public void setProductID(String productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public void addDiscount(DiscountStrategy discount){
        DiscountStrategy[] tempDiscounts = new DiscountStrategy[discounts.length + 1];
        System.arraycopy(discounts, 0, tempDiscounts, 0, discounts.length);
        tempDiscounts[discounts.length] = discount;
        discounts = tempDiscounts;
        populateDiscounts(discounts[0].getQty());
    }
    
    public void populateDiscounts(int qty){
        for (DiscountStrategy d : discounts) {
            
            d.setProductPrice(this.getProductPrice());
            d.setQty(qty);
        }
    }

    public DiscountStrategy[] getDiscounts() {
        return discounts;
    }


    
    
    
}
