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
public class Car {
    private String ID;
    private CarSpec spec;
    private Rental rental;
    
    public Car(String ID, CarSpec spec){
        this.ID = ID;
        this.spec = spec;
    }

    public String getID() {
        return ID;
    }

    public CarSpec getSpec() {
        return spec;
    }
    
    public Rental getRental() {
        return rental;
    }
    
    public void rentCar() {
        rental.rentCar();
    }
    
    public void returnCar() {
        rental.returnCar();;
    }
    
    public Boolean isAvailable() {
        return (rental.getStatus() == Status.returned);
    }
    
    public boolean contains(String data){
        return ID.contains(data) || spec.contains(data);
    }
}
