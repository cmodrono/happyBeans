/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package happybeans;

//class signature

import java.util.ArrayList;
import java.util.Scanner;

public class HappyBeans {

    static Scanner reader = new Scanner(System.in);
    static String choice;
    
    //main method
    public static void main(String[] args) {
        
        boolean running = true;
        
        ArrayList dealerships = new ArrayList();
        
        while (running) {
        
            System.out.println("What would you like to do?");
            System.out.println("    1.) Help!");
            System.out.println("    2.) Manage Dealerships");
            System.out.println("    3.) Print Dealerships");
            System.out.println("    4.) QUIT");
        
            getResponse();
            
            
            // bool || bool
            // bool && bool
            if (choice.equals("1") || choice.toLowerCase().equals("one")) {
                System.out.println("You suck bro figure it out yoursrlf!!! ;)\n");
            }
            
            else if (choice.equals("2") || choice.toLowerCase().equals("two")) {
                System.out.println("What would you like to do?");
                System.out.println("    1.) choose dealership");
                System.out.println("    2.) create new dealership");
                System.out.println("    3.) ..");
                
                while (true) {
                    getResponse();
                    
                    if (choice.equals("1") || choice.toLowerCase().equals("one")) {
                        //TODO submenu
                    } else if (choice.equals("2") || choice.toLowerCase().equals("two")) {
                        
                        System.out.println("What would you like your new dealership to be named?");
                        getResponse();
                        String tempName = choice;
                        
                        System.out.println("Where is " + tempName + " located?");
                        getResponse();
                        String tempLoc = choice;
                        
                    } else if (choice.equals("3") || choice.toLowerCase().equals("three")) {
                        break;
                    }
                }
            }
            
            //TODO choice 3
            
            else if (choice.equals("4") || choice.toLowerCase().equals("four")) {
                System.out.println("YOU TAKE CARE NOW!!!");
                running = false;
            }
        }




//        // My name is pepe and i am creating dis programme to keep inventory...Si...
//        
//        //creating a new car object
//        Car tesla = new Car("Tesla", "TX1", 1999, 741.85);
//        
//        //Printing Car Specs
//        System.out.println(tesla.toVerboseString());
//        
//        //Wrecking car and printing specs
//        //tesla.wreckIt();
//        //System.out.println(tesla);
//        
//        //test dealership
//        String[] x = {"bob", "stacy"};
//        Dealership dTest = new Dealership("New Mexico", x, "Test Dealership");
//        dTest.inv.add(tesla);
//        System.out.println(dTest);
        
        
    }
    public static void getResponse() {
        System.out.print("> ");
        choice = reader.nextLine();
    }
    
}
