/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1exercise3;

/**
 *
 * @author Diego
 */
public class Store {
    private Address address;
    private Car[] cars;
    int numCars;
    
    public Store(Address address){
        this.address = address;
        this.cars = new Car[20];
        this.numCars = 0;
    }

    public Address getAddress() {
        return address;
    }
    
    public boolean addcar(Car car){
        if(this.numCars < 20){
          this.cars[this.numCars] = car;
          this.numCars++;
          return true;
        }else
            return false;
    }
}
