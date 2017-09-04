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
    private Car[] cars = new Car[20];
    private int numCars;

    public Store(Address address) {
        this.address = address;
        for (int i = 0; i < this.cars.length; i++) {
            this.cars[i] = new Car(new CarModel(new Category("vacio"), "vacio", 0), 0);
        }
this.cars = new Car[20];
        this.numCars = 0;
    }

    public Address getAddress() {
        return address;
    }

    public boolean addcar(Car car) {
        if (this.numCars < 20) {
            this.cars[this.numCars] = car;
            this.numCars++;
            return true;
        } else {
            return false;
        }
    }

    public String[] listar() {
        String[] lista = new String[20];
        for(int i = 0; i < lista.length; i++) {
            lista[i] = this.cars[i].getmodel().getModelNumber() + ", " + this.cars[i].getmodel().getCategory().getName();
        }
        return lista;
    }

}
