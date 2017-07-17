/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business_logic;


/**
 *
 * @author Shazam
 */

public class Customer{
    private String name;
    private String phone;
    private String address;
    private String ID;

    public Customer(String ID, String name, String phone, String address) {
        this.ID = ID;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }
    
    
    public boolean contains(String data){
        return (this.ID.contains(data) || (this.name.contains(data)) || (this.phone.contains(data)) || (this.address.contains(data)));
                
    }
}
