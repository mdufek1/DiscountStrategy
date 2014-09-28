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
        
   
        register.startOrder("0002");
        register.checkOutItem("8A129", 2);
        register.checkOutItem("1F148", 1);
        register.checkOutItem("7U124", 1);
        register.outputReciept();
     
        register.startOrder("0003");
        register.checkOutItem("7U124", 1);
        register.outputReciept();
    }
}
