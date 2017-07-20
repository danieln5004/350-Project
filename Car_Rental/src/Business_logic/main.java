package Business_logic;

import UserInterface.CustomerFrame;
import java.util.ArrayList;
import java.util.List;

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
            
        List<Customer> customers = new ArrayList();
        customers.add(new Customer("1","Samir James", "816-878-1111", "6102 NE Antioch Rd"));
        customers.add(new Customer("2","Kim Sam", "816-847-888", "7123 Main Street"));
        customers.add(new Customer("3","Mehmet Scholl", "816-444-2387", "12 Rockhil Rd"));
        
        CarRentalSystem system = new CarRentalSystem();
        
        system.addCar("Altima", "Nissan", 2012, Size.small);
        system.addCar("Altima", "Nissan", 2012, Size.midsize);
        system.addCar("Passat", "Volks Wagen", 2002, Size.large);
        system.addCar("Benz", "Mercedes", 2000, Size.midsize);
        
        CustomerFrame cf = new CustomerFrame(system, customers);
        cf.setVisible(true);
    
    }
}
