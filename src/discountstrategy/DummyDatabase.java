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
public class DummyDatabase {
   public static final Product[] products = new Product[5];     
   public static final Customer[] customers = new Customer[4];     
   
   
   static{
        products[0]=new Product("8A129","6-Pack of White Socks",3.19);
        products[0].addDiscount(new PercentDiscount());
        products[0].addDiscount(new FlatDiscount(1.00));
        products[1]=new Product("2P531","Sweatpants Black Mens",10.49);
        products[2]=new Product("1F148","White Long Sleeve Dress Shirt Mens",21.18);
        products[3]=new Product("7U124","Wool Knit Cap",9.29);
        products[4]=new Product("4S456", "Brown Shoes", 30.55);
        
        customers[0]=new Customer("Tim","Johnson", "0001");
        customers[1]=new Customer("John", "Timson", "0002");
        customers[2]=new Customer("Carol","Brown","0003");
        customers[3]=new Customer("Amy", "Jones", "0004");
    }
}
