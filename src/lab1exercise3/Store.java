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
    int modelo;
    int categoria;
       
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
    
    public CarModel[] listarCarros(int numCars){
        CarModel[] modelo  = new CarModel[numCars];
        for (int i = 0; i < numCars; i++) {
            modelo[i] = this.cars[numCars].getModel();
        }
        return modelo;
        
        /*Car[] categoria  = new Car[numCars];
        for (int i = 0; i < numCars; i++) {
            categoria[i] = this.categoria;
        }
        return modelo;
    }
        //String[] categoria  = new String[20];
    /*public String[] mostrarZona(int numZona) {
        String[] placaVehiculo = new String[5];
        for (int i = 0; i < 5; i++) {
            placaVehiculo[i] = this.zonas[numZona].getVehiculos(i).getPlaca();
        }
        return placaVehiculo;
    */
    }    
    
    
}
