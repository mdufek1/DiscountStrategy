/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package discountstrategy;



/**
 * This class represents an output method
 * @author mdufek1
 */
public interface DisplayStrategy {
    /**
     * this accepts a message and outputs it accordingly.
     * @param message 
     */
    public abstract void outputReciept(String message);
}
