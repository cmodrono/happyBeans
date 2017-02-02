/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package happybeans;

/**
 *
 * @author CCHS
 */
public class Car {
    String make;
    String model;
    int year;
    double price;
    
    public Car(String ma, String mo, int y, double p) {
        make = ma;
        model = mo;
        year = y;
        price = p;
    }
    
    
    public String toVerboseString() {
        return "this is a " + make + " " + model + " from " + year + " that costs $" + price;
    }
    
    @Override
    public String toString() {
        return make + " " + model + " " + year + " $" + price;
    }
    
    public void wreckIt(){
        make = "scrap";
        model = "metal";
        year = 0000;
        price = 0.99;
    }
}
