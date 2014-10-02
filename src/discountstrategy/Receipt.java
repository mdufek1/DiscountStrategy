package discountstrategy;

/**
 * This class represents a receipt and contains LineItems and Customer Info.
 * @author Mike
 */
public class Receipt {
    private Customer customer;
    private Product product;
    LineItem lineItem = new LineItem();
    LineItem[] lineItems = new LineItem[0];
    
    /**
     * Looks up a customer in a database and initializes the customer object
     * @param customerNumber - the customer number, passed in from the registers StartOrder Method.
     */
     public void customerLookup(String customerNumber){
        
        
        for (Customer i: DummyDatabase.customers) {
           
            if(i.getCustomerNumber().equals(customerNumber)){
                
                customer = i;
                break;
            }
            else{
                customer = new Customer("Not Found","Not Found","Not Found");
            }
        }
        
    }
     
    /**
     * initializes the product variable, and provides a quantity, makes sure the product is ready to be 
     * passed to the line item class and finally added to the line item array.
     * @param productID - the productID passed in from the registers checkOutItem method
     * @param qty - quantity of the item passed in from the registers checkOutItem method
     */
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
    
    
    /**
     * Calculates the amount saved by looping through the Array of line item and returns a double of the amount saved. 
     * @return 
     */
    public double calculateAmountSaved(){
        double saved = 0;
        for (LineItem l: this.lineItems) {
            saved+=l.getTotalOff();
        }
        return saved;
    }
   
    /**
     * Adds a line item to the line item array in the receipt
     * @param lineItem - a line item that is most likely generated from the LineItem Class.
     */
    public void addLineItem(LineItem lineItem){
        LineItem[] tempLines = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempLines, 0, lineItems.length);
        tempLines[lineItems.length] = lineItem;
        lineItems = tempLines;
    }

    /**
     * gets the LineItem Array
     * @return LineItem array
     */
    public LineItem[] getLineItems() {
        return lineItems;
    }
    
    /**
     * gets the customer object
     * @return customer object
     */

    public Customer getCustomer() {
        return customer;
    }
    
    
    
}
