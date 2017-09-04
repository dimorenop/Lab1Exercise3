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
public class CarModel {

    private Category category;
    private String modelNumber;
    private int price;

    public CarModel(Category category, String modelNumber, int price) {
        this.category = category;
        this.modelNumber = modelNumber;
        this.price = price;      
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
