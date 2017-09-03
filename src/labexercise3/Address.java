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
public class Address {

    private String house;
    private String county;
    private String postCode;

    public Address(String house, String county, String postCode) {
        this.house = house;
        this.county = county;
        this.postCode = postCode;
    }

    public String getHouse() {
        return house;
    }

    public String getCounty() {
        return county;
    }

    public String getPostcode() {
        return postCode;
    }

}
