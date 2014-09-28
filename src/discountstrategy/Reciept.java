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
public class Reciept {
    private Customer customer;
    private Product product;
    LineItem lineItem = new LineItem();
    LineItem[] lineItems = new LineItem[0];

     public Customer customerLookup(String customerNumber){
        
        
        for (Customer i: DummyDatabase.customers) {
           
            if(i.getCustomerNumber().equals(customerNumber)){
                
                customer = i;
                break;
            }
            else{
                customer = new Customer("Not Found","Not Found","Not Found");
            }
        }
        return customer;
    }
     
    public void addCheckedOutItem(String productID, int qty){
       
         for (Product p : DummyDatabase.products) {
            if(p.getProductID().equals(productID)){
                product = p;
                break;
            }
            else{
                product = new Product("Not Found","Not Found",0.00);
            }
          
        }
        
         product.populateDiscounts(qty);
        addLineItem( lineItem.calculateLine(product, qty));
         
         

    }
    
    public void addLineItem(LineItem lineItem){
        LineItem[] tempLines = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempLines, 0, lineItems.length);
        tempLines[lineItems.length] = lineItem;
        lineItems = tempLines;
    }

    public LineItem[] getLineItems() {
        return lineItems;
    }
    
    
    
}
