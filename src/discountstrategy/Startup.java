package discountstrategy;
/*
* Todo:
*       Comment:
            DisplayStrategy
*       Create:
            DisplayStrategy
            GuiOutput
            ConsoleOutput
        
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
        register.outputReceipt(new ConsoleOutput());
        
   
        register.startOrder("0002");
        register.checkOutItem("8A129", 2);
        register.checkOutItem("1F148", 1);
        register.checkOutItem("7U124", 1);
        register.outputReceipt(new ConsoleOutput());
     
        register.startOrder("0003");
        register.checkOutItem("7U124", 1);
        register.outputReceipt(new GuiOutput());
    }
}
