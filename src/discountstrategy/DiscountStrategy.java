package discountstrategy;

/**
 * This Class Provides a Template for other DiscountStrategies
 * @author Mike
 */
public interface DiscountStrategy {
    /**
     * calculates the discount amount
     * @param qty
     * @param productPrice 
     */
    public abstract double discount(int qty, double productPrice);
    /**
     * gets the discount type
     * @return 
     */
    public abstract String getDISCOUNT_TYPE();
    /**
     * gets the discount amount
     * @return 
     */
    public abstract double getDiscountAmount();
    /**
     *sets the discount amount
     * @param discountAmount 
     */
    public abstract void setDiscountAmount(double discountAmount);
    /**
     * gets the product Price
     * @return 
     */
    public abstract double getProductPrice();
    /**
     *  sets the productPrice
     * @param productPrice 
     */
    
    /**
     * sets the product price in the discount, used for calculations
     * @param productPrice 
     */
    public abstract void setProductPrice(double productPrice);
    
    /**
     *  gets the quantity of the items being discounted
     * @return 
     */
    public abstract int getQty();
    
    /**
     * sets the quantity of items in the discount, used for calculations
     * @param qty 
     */
    public abstract void setQty(int qty);
    /**
     * gets the calculated discount
     * @return 
     */
    public abstract double getCalculatedDiscount();
}
