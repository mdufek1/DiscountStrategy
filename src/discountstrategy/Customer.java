
package discountstrategy;

/**
 * This class represents a customer in a physical store.
 * @author Mike
 */
public class Customer {
    private String firstName;
    private String lastName;
    private String customerNumber;

    public Customer(String firstName, String lastName, String customerNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerNumber = customerNumber;
    }

    /**
     * 
     * @return firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * sets the first name of the customer
     * @param firstName 
     */
    public void setFirstName(String firstName) {
        if(firstName == null || firstName.isEmpty()){
            throw new IllegalArgumentException("CustomerNumber must be a valid string");
        }
        this.firstName = firstName;
    }

    /**
     * 
     * @return lastName
     */
    public String getLastName() {
        return lastName;
    }
    
    /**
     * sets the last name of the customer
     * @param lastName 
     */
    public void setLastName(String lastName) {
        if(lastName == null || lastName.isEmpty()){
            throw new IllegalArgumentException("CustomerNumber must be a valid string");
        }
        this.lastName = lastName;
    }

    /**
     * 
     * @return customerNumber
     */
    public String getCustomerNumber() {
        return customerNumber;
    }

    /**
     * sets the customer's number
     * @param customerNumber 
     */
    public void setCustomerNumber(String customerNumber) {
        if(customerNumber == null || customerNumber.isEmpty()){
            throw new IllegalArgumentException("CustomerNumber must be a valid string");
        }
        this.customerNumber = customerNumber;
    }
    
    
}
