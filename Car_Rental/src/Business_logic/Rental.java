/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business_logic;

import java.util.Calendar;

/**
 *
 * @author Shazam
 */
public class Rental {
    private Calendar rentDate;
    private Calendar returnDate;
    private Status status;

    public Rental() {
        this.status = status;
    }
    
    public Calendar getRentDate() {
        return this.rentDate;
    }

    public Calendar getReturnDate() {
        return this.returnDate;
    }
    
    public Status getStatus() {
        return this.status;
    }
   
    public Calendar getRentDate() {
        return this.rentDate;
    }

    public Calendar getReturnDate() {
        return this.returnDate;
    }
    
    public Status getStatus() {
        return this.status;
    }
    
    public void rentCar() {
        this.rentDate = Calendar.getInstance();
        this.status = Status.rented;
    }
    
    public void returnCar() {
        this.returnDate = Calendar.getInstance();
        this.status = Status.returned;
    }
}
