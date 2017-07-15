/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business_logic;

//<<<<<<< Updated upstream
import java.util.List;
//=======
//>>>>>>> Stashed changes
import java.util.LinkedList;

/**
 *
 * @author Shazam
 */

//Main Class that talks to other classes
public class CarRentalSystem {
//<<<<<<< Updated upstream
    List<Car> carList;
    List<Customer> customerList;

    public CarRentalSystem() {
        carList = new LinkedList();
        customerList = new LinkedList();
    }
 
    public List<Car> getCarList() {
        return carList;
    }
    
    public List<Customer> getCustomerList(){
        return customerList;
    }
    
    public void addCar(String make, String model, int year, Size size) {
        CarSpec spec = new CarSpec(make, model, year, size);
        String ID = Integer.toString(carList.size());
        Car car = new Car(ID, spec);
        carList.add(car);
    }
    
    public List<Car> findCar(String data) {
        List<Car> list = new LinkedList();
        for (Car car: carList) {
            if (car.contains(data)) {
                list.add(car);
            }
        }
        return list;
    }
    
    public Boolean rentCar(String data) {
        List<Car> car = findCar(data);
        for (Car rentCar: car) {
            if (!rentCar.isAvailable()) {
                rentCar.rentCar();
                return true;
            }
        }
        return false;
    }
    
    public Boolean returnCar(String ID) {
        for (Car car: carList) {
            if (car.getID().equals(ID)) {
                car.returnCar();
                return true;
            }
        }
        return false;
    }

//=======
    
//>>>>>>> Stashed changes
    
    
    
   
    public void addCustomer(String ID, String name, String phone, String address){
        Customer customer = new Customer(ID ,name, phone, address);
        customerList.add(customer);
    }
    
    public List<Customer> CustomerSearch(String data) {
        List<Customer> list = new LinkedList();
        for (Customer customer: customerList) {
            if (customer.contains(data)) {
                list.add(customer);
            }
        }
        return list;
    }
        
    
    
}
