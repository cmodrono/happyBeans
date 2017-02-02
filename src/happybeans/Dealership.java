/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package happybeans;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author CCHS
 */
public class Dealership {
    
    ArrayList inv;
    String loc;
    String[] employees;
    String name;
    
    public Dealership(String l, String[] e, String n){
        loc = l;
        employees = e;
        name = n;
        inv = new ArrayList();
    }
    
    public String toString() {
        String temp = Arrays.toString(employees);
        return "Name: " + name + "\nInventory: " + inv + "\nLocation: " + loc + "\nEmployees: " + temp;
    }
}
