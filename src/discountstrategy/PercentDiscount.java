
package discountstrategy;

/**
 * this class discounts a product by a percentage
 * @author Mike
 */
public class PercentDiscount implements DiscountStrategy {
    public static final String DISCOUNT_TYPE = "Percent Discount";
    private double discountAmount = 0.15;
    public int qty;
    private double productPrice;
    private double calculatedDiscount;
    
    @Override
    public void discount(int qty, double productPrice) {
       if(qty<1){
            throw new IllegalArgumentException("Quantity must be 1 or greater");
        }
       else if(productPrice<0){
            throw new IllegalArgumentException("productPrice must be greater than 0");
        }
       else{
       calculatedDiscount = (productPrice * qty) * discountAmount;
       }
    }

    public PercentDiscount() {
    }

    public PercentDiscount(double discountAmount) {
        setDiscountAmount(discountAmount);
    }

    @Override
    public String getDISCOUNT_TYPE() {
        return DISCOUNT_TYPE;
    }

    @Override
    public double getDiscountAmount() {
        return discountAmount;
    }

    @Override
    public void setDiscountAmount(double discountAmount) {
        if(discountAmount > 1 || discountAmount < 0){
            throw new IllegalArgumentException("The discount amount must be less than one and greater than or equal to 0"); 
        }
        else{this.discountAmount = discountAmount;}
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
//       if(qty<1){
//            throw new IllegalArgumentException("Quantity must be 1 or greater");
//        }
       this.qty = qty;
    }

    @Override
    public double getCalculatedDiscount() {
        return calculatedDiscount;
    }
    
    
    
}
