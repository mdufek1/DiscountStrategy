/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *
 * @author Mike
 */
public class Register {
    Reciept reciept;
    
    RecieptPrinter recieptPrinter = new RecieptPrinter();
    public void startOrder(String customerNumber){
        reciept = new Reciept();
        reciept.customerLookup(customerNumber);
    }
    
    public void checkOutItem(String productID, int qty){
        
        reciept.addCheckedOutItem(productID, qty);
    }
  
    public void outputReciept(){
        recieptPrinter.outputReciept(this.reciept);
    }

}
