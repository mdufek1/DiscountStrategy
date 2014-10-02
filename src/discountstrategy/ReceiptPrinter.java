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
      
    public void outputReceipt(Receipt receipt, DisplayStrategy display){
        String message="";
        message+="________________________________________________________________________________________________________________________\n";
        message+="Khols Store Number: "+this.storeNumber+"\n";
        message+="Customer Number: "+receipt.getCustomer().getCustomerNumber()+"\n";
        message+="________________________________________________________________________________________________________________________\n";
//        System.out.println("________________________________________________________________________________________________________________________");
//        System.out.println("Khols Store Number: "+this.storeNumber);
//        System.out.println("Customer Number: "+receipt.getCustomer().getCustomerNumber());
//        System.out.println("________________________________________________________________________________________________________________________");
        LineItem[] lineitems = receipt.getLineItems();
        for(LineItem l: lineitems){
            message+=l.toString()+"\n";
        }
        message+="________________________________________________________________________________________________________________________\n";
        message+="You Saved: "+ nf.format(receipt.calculateAmountSaved())+"\n";
        message+="Thank you for your patronage!\n";
        message+="________________________________________________________________________________________________________________________\n\n\n";
        //System.out.println("________________________________________________________________________________________________________________________");
        //System.out.println("You Saved: "+ nf.format(receipt.calculateAmountSaved()));
       // System.out.println("Thank you for your patronage!");
       // System.out.println("________________________________________________________________________________________________________________________");
        //System.out.println("\n\n");
        
        display.outputReciept(message);
    }
}
