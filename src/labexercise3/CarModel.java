/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexercise3;

/**
 *
 * @author Diego
 */
public class CarModel {

    private Category category;
    private String modelNumber;
    private int price;
    private Car[] model;

    public CarModel(Category category, String modelNumber, int price) {
        this.category = category;
        this.modelNumber = modelNumber;
        this.price = price;
        this.model = new Car[10]; //Aquí hay un array list      
    }

    public Category getCategory() {
        return category;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public int getPrice() {
        return price;
    }

}
