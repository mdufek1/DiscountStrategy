package discountstrategy;

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
  
    
    public void outputReciept(Reciept reciept){
        LineItem[] lineitems = reciept.getLineItems();
        for(LineItem l: lineitems){
            System.out.println(l.toString());
        }
    }
}
