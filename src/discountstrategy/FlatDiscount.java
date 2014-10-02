
package discountstrategy;

/**
 * this class discounts a product by a set dollar amount
 * @author Mike
 */
public class FlatDiscount implements DiscountStrategy {
    public static final String DISCOUNT_TYPE = "Flat Discount";
    public double discountAmount = 1.00;
    public int qty;
    private double productPrice;
    private double calculatedDiscount;

    public FlatDiscount(double discountAmount) {
        this.discountAmount = discountAmount;
    }
    
    
    @Override
    public double discount(int qty, double productPrice) {
        if(qty<1){
            throw new IllegalArgumentException("Quantity must be 1 or greater");
        }
       else if(productPrice<0){
            throw new IllegalArgumentException("productPrice must be greater than 0");
        }
       else{
      calculatedDiscount = productPrice - (qty * discountAmount);
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
        if(discountAmount > 1 || discountAmount < 0){
            throw new IllegalArgumentException("The discount amount must be less than one and greater than or equal to 0"); 
        }
        this.discountAmount = discountAmount;
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
//        if(qty<1){
//            throw new IllegalArgumentException("Quantity must be 1 or greater");
//        }
       this.qty = qty;
    }

    @Override
    public double getCalculatedDiscount() {
        return calculatedDiscount;
    }
   



    
}
