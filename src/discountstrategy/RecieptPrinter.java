package discountstrategy;

import java.text.NumberFormat;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Mike
 */
public class RecieptPrinter {
  String storeNumber = "4856";
NumberFormat nf = NumberFormat.getCurrencyInstance();    
    public void outputReciept(Reciept reciept){
        System.out.println("________________________________________________________________________________________________________________________");
        System.out.println("Khols Store Number: "+this.storeNumber);
        System.out.println("Customer Number: "+reciept.getCustomer().getCustomerNumber());
        System.out.println("________________________________________________________________________________________________________________________");
        LineItem[] lineitems = reciept.getLineItems();
        for(LineItem l: lineitems){
            System.out.println(l.toString());
        }
        System.out.println("________________________________________________________________________________________________________________________");
        System.out.println("You Saved: "+ nf.format(reciept.calculateAmmountSaved()));
        System.out.println("Thank you for your patronage!");
        System.out.println("________________________________________________________________________________________________________________________");
        System.out.println("\n\n");
        
    }
}
