/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategy;

/**
 *This class is plain console output
 * @author Mike
 */
public class ConsoleOutput implements DisplayStrategy{

    @Override
    public void outputReciept(String message) {
        System.out.println(message);
    }


    
}
