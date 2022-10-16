
package assignment.pkg2;

import java.io.Serializable;

/**
 * Address class containing methods able to create and set an address object. 
 * Does basic error checking and allows for a range or versatile addresses
 * It is also intended to be serialized
 */
public class Address implements Serializable{

    @Override
    public String toString() {
        return streetNumber + " " + streetName + ", " + City + ", " + postCode;
    }

    /**
     * Constructs the address class by using the internal set methods. 
     * By doing this, it allows for error checking to be done directly through
     * the set methods therefore preventing any erroneous address 
     * @param streetNumber
     * @param streetName
     * @param City
     * @param postCode
     */
    public Address(String streetNumber, String streetName, String City, String postCode) {
        this.setStreetNumber(streetNumber);
        this.setStreetName(streetName);
        this.setCity(City);
        this.setPostCode(postCode);
    }
    private String streetNumber;
    private String streetName;
    private String City;
    private String postCode;

    /**
     * @return the streetNumber
     */
    public String getStreetNumber() {
        return streetNumber;
    }

    /**
     * Sets the street number, the validation ensures that there is at least one
     * digit in the address 
     * @param streetNumber the streetNumber to set
     */
    public final void setStreetNumber(String streetNumber) {
        if (streetNumber.trim().matches("^[\\d]+$") && streetNumber.trim().matches(".*\\d.*")) {
            this.streetNumber = streetNumber.trim();
        }else{
            throw new IllegalArgumentException("Invalid Street number.");
        }
        
    }

    /**
     * @return the streetName
     */
    public String getStreetName() {
        return streetName;
    }

    /**
     * Sets the street name. Validation ensures street name is only alphabetic
     * with some special characters
     * @param streetName the streetName to set
     */
    public final void setStreetName(String streetName) {
        if (streetName.trim().matches("^[a-zA-z' ]+$")){
            this.streetName = streetName.trim();
        }else{
            throw new IllegalArgumentException("Invalid Street name. No special characters");
        }
        
    }

    /**
     * @return the City
     */
    public String getCity() {
        return City;
    }
    
    /**
     * Sets the City. Validation checks that the City is only alphanumeric 
     * with some special characters
     * @param City the City to set
     */
    public final void setCity(String City) {
        
        if (City.trim().matches("^[a-zA-z' ]+$")){
            this.City = City.trim();
        }else{
            throw new IllegalArgumentException("Invalid City name. No special characters");
        }
    }

    /**
     * @return the postCode
     */
    public String getPostCode() {
        return postCode;
    }

    /**
     * Checks if the post code is at least 6 numbers
     * @param postCode the postCode to set
     */
    public final void setPostCode(String postCode) {
        if (postCode.trim().matches("\\d{6}")){
            this.postCode = postCode.trim();
        }else{
            throw new IllegalArgumentException("Post code must be a positive numerical value and have 6 numbers");
        }
        
    }
}
