package discountstrategy;

/**
 * This Class is the high level class that acts as the register, similar to one in a real store.
 * It delegates to the other classes and doesn't do much else.
 * 
 * @version 0.90
 * @author Mike
 */
public class Register {
    Receipt receipt;
    ReceiptPrinter receiptPrinter = new ReceiptPrinter();
    
    /**
     * Starts a new order, creates a new receipt object, and looks up the customer number to 
     * initialize the variable on the receipt.
     * @param customerNumber - The customer number
     * @param database
     *
     */
    public void startOrder(String customerNumber){
//        if(customerNumber == null || customerNumber.isEmpty()){
//            throw new IllegalArgumentException("CustomerNumber must be a valid string");
//        }
        
        receipt = new Receipt();
        receipt.startNewOrder(customerNumber);
    }
    
    /**
     *  Sends an item to be looked up by the receipt object and provides a quantity.
     * @param productID - the ID of the product
     * @param qty  - the quantity of the product
     */
    public void checkOutItem(String productID, int qty){
        if(productID == null || productID.isEmpty()){
            throw new IllegalArgumentException("productID must be a valid string");
        }
        else if(qty<1){
            throw new IllegalArgumentException("Quantity must be 1 or greater");
        }
        
        else{receipt.addCheckedOutItem(productID, qty);}
    }
  
    /**
     * Simply outputs the receipt.
     * @param display
     */
    public void outputReceipt(DisplayStrategy display){
        receiptPrinter.outputReceipt(this.receipt,display);
    }


}
