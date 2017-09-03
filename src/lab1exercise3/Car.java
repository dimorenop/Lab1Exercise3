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
public class Car {

    private CarModel model;
    private int traveled;

    public Car(CarModel model, int traveled) {
        this.traveled = traveled;
        this.model = model;
    }

    public CarModel getmodel() {
        return model;
    }

    public int getTraveled() {
        return traveled;
    }

    public void setTraveled(int traveled) {
        this.traveled = traveled;
    }

}
