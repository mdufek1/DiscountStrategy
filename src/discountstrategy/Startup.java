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
public class Startup {
    public static void main(String[] args) {
       Register register = new Register();
       
        register.startOrder("0001");
        register.checkOutItem("8A129", 2);
        register.outputReciept();
    }
}
