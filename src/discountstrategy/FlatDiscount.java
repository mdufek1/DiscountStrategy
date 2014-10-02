
package discountstrategy;

/**
 * this class discounts a product by a set dollar amount
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

    public double getDiscountAmount() {
        return discountAmmount;
    }

    @Override
    public void setDiscountAmount(double discountAmmount) {
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
