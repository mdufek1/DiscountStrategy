/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discountstrategy;

/**
 *represents a database template
 * @author mdufek1
 */
public interface DatabaseStrategy {
    /**
     * gets the product array
     * @return 
     */
    public abstract Product[] getProducts();
    /**
     * gets the customer array
     * @return 
     */
    public abstract Customer[] getCustomers();
}
