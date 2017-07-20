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
public class CarSpec {
    private String make;
    private String model;
    private int year;
    private Size size;
    private Calendar Rented;
    private Calendar returnDate;

    public CarSpec(String make, String model, int year, Size size) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.size = size;
        
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public Size getSize() {
        return size;
    }

    public Calendar getRented() {
        return Rented;
    }

    public void setRented(Calendar Rented) {
        this.Rented = Rented;
    }

    public Calendar getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Calendar returnDate) {
        this.returnDate = returnDate;
    }
    
    
    
    
      
    public boolean contains(String data){
        return (make.contains(data) || 
                (model.contains(data)) || 
                (""+year).contains(data)) ||
                (size.toString().contains(data));
    }
}
