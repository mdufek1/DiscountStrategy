package discountstrategy;

/**
 *
 * This class represents a product in a store.
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

    /**
     * 
     * @return productID
     */
    public String getProductID() {
        return productID;
    }
    
    /**
     * sets the productID
     * @param productID
     */
    public void setProductID(String productID) {
        if(productID == null || productID.isEmpty()){
            throw new IllegalArgumentException("productID must be a valid string");
        }
        else{this.productID = productID;}
    }

    /**
     * 
     * @return productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * sets the productName
     * @param productName 
     */
    public void setProductName(String productName) {
        if(productName == null || productName.isEmpty()){
            throw new IllegalArgumentException("productName must be a valid string");
        }
        this.productName = productName;
    }

    /**
     * 
     * @return productPrice
     */
    public double getProductPrice() {
        return productPrice;
    }
    /**
     * sets the productPrice
     * @param productPrice 
     */
    public void setProductPrice(double productPrice) {
        if(productPrice<0){
            throw new IllegalArgumentException("productPrice must be greater than 0");
        }
        this.productPrice = productPrice;
    }
    /**
     * adds a discount to the products discount array, this allows a product to have multiple discounts.
     * the array is a normal array so the majority of the method is just resizing the array. the discounts get populated later.
     * @param discount - A DiscountStrategy
     */
    public void pushDiscount(DiscountStrategy discount){
        DiscountStrategy[] tempDiscounts = new DiscountStrategy[discounts.length + 1];
        System.arraycopy(discounts, 0, tempDiscounts, 0, discounts.length);
        tempDiscounts[discounts.length] = discount;
        discounts = tempDiscounts;
        
            populateDiscounts(discounts[0].getQty());
    }
    
    /**
     * Loops through the discount array and inputs the quantity into each DiscountStrategy 
     * so that they are able to properly do their calculations
     * @param qty 
     */
    public void populateDiscounts(int qty){
        for (DiscountStrategy d : discounts) {
            
            d.setProductPrice(this.getProductPrice());
            d.setQty(qty);
        }
    }
    
    /**
     * 
     * @return array of DiscountStrategies
     */
    public DiscountStrategy[] getDiscounts() {
        return discounts;
    }


    
    
    
}
