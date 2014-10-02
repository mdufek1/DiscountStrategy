/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 * This class represents a database
 * @author Mike
 */
public class DummyDatabase implements DatabaseStrategy {
   public static final Product[] products = { 
       new Product("8A129","6-Pack of White Socks",3.19,new PercentDiscount())
      ,new Product("2P531","Sweatpants Black Mens",10.49)
      ,new Product("1F148","White Long Sleeve Dress Shirt Mens",21.18)
      ,new Product("7U124","Wool Knit Cap",9.29,new PercentDiscount(.20))
      ,new Product("4S456", "Brown Shoes", 30.55)
   };     
   
   public static final Customer[] customers = { new Customer ("Tim","Johnson", "0001"),new Customer("John", "Timson", "0002"),new Customer("Carol","Brown","0003"),new Customer("Amy", "Jones", "0004")};     

   @Override
    public Product[] getProducts() {
        return products;
    }

   @Override
    public Customer[] getCustomers() {
        return customers;
    }
    

}
