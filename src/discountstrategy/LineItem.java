package discountstrategy;

import java.text.NumberFormat;

/**
 *This class represents a line on a receipt.
 * @author Mike
 */
public class LineItem {
    String productID;
    String productName;
    double productPrice;
    int qty;
    double totalOff = 0;
    double total;

    public LineItem(String productID, String productName, double productPrice, int qty, double totalOff, double total) {
        this.productID = productID;
        this.productName = productName;
        this.productPrice = productPrice;
        this.qty = qty;
        this.totalOff = totalOff;
        this.total = total;
    }

    public LineItem() {
    }
    
    /**
     * Takes a product and quantity and calculates the discount and puts all the information into a lineItem object
     * @param product - product object
     * @param qty - how many of that product
     * @return LineItem
     */
    public LineItem calculateLine(Product product,int qty){
        
        
        for (DiscountStrategy d : product.getDiscounts()) {
            
            d.discount(d.getQty(),d.getProductPrice());
            totalOff += d.getCalculatedDiscount();
        }
        
       total = (product.getProductPrice()*qty)-totalOff;
        
       LineItem lineItem = new LineItem(product.getProductID(), product.getProductName(), product.getProductPrice(),qty, totalOff, total );
//       System.out.println(lineItem.toString());  
      return lineItem;
    }
    
    /**
     * converts a lineitem into a string.
     * @return 
     */
    @Override
    public String toString(){
       NumberFormat nf = NumberFormat.getCurrencyInstance();
        String output = this.productID+" | "+this.productName+" | "+nf.format(this.productPrice)+" | "+this.qty+" | "+nf.format(this.totalOff)+" | "+nf.format(this.total);
        return output;
        
    }

    /**
     * gets the total amount off that was calculated in the calculateLine method
     * @return 
     */
    public double getTotalOff() {
        return totalOff;
    }

    
}
