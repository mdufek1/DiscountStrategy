package discountstrategy;

import java.text.NumberFormat;

/**
 *  This class outputs the receipt object
 * @author Mike
 */
public class ReceiptPrinter {
  String storeNumber = "4856";
  

NumberFormat nf = NumberFormat.getCurrencyInstance();   
/**
 * This outputs the receipt, it's a bit sloppy but functional
     * @param receipt - the receipt object that contains all the necessary information
 */
    public void outputReceipt(Receipt receipt){
        System.out.println("________________________________________________________________________________________________________________________");
        System.out.println("Khols Store Number: "+this.storeNumber);
        System.out.println("Customer Number: "+receipt.getCustomer().getCustomerNumber());
        System.out.println("________________________________________________________________________________________________________________________");
        LineItem[] lineitems = receipt.getLineItems();
        for(LineItem l: lineitems){
            System.out.println(l.toString());
        }
        System.out.println("________________________________________________________________________________________________________________________");
        System.out.println("You Saved: "+ nf.format(receipt.calculateAmountSaved()));
        System.out.println("Thank you for your patronage!");
        System.out.println("________________________________________________________________________________________________________________________");
        System.out.println("\n\n");
        
    }
}
