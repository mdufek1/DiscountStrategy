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
     *
     */
    public void startOrder(String customerNumber){
        receipt = new Receipt();
        receipt.customerLookup(customerNumber);
    }
    
    /**
     *  Sends an item to be looked up by the receipt object and provides a quantity.
     * @param productID - the ID of the product
     * @param qty  - the quantity of the product
     */
    public void checkOutItem(String productID, int qty){
        
        receipt.addCheckedOutItem(productID, qty);
    }
  
    /**
     * Simply outputs the receipt.
     */
    public void outputReceipt(){
        receiptPrinter.outputReceipt(this.receipt);
    }

}
