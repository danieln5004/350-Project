package Business_logic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shazam
 */
public class main {
    public static void main(String[] args){
    CarRentalSystem rent= new CarRentalSystem();
    
    rent.addCustomer("1", "Samir James", "816-878-1111", "6102 NE Antioch Rd");
    rent.addCustomer("2", "Kim Sam", "816-847-888", "7123 Main Street");
    rent.addCustomer("3", "Mehmet Scholl", "816-444-2387", "12 Rockhill Rd");
    
    
    
    //not putting out customer info to the console
    for(Customer customer: rent.customerList){
        System.out.print(rent.customerList + "\n");
    }
    
    
    }
}
