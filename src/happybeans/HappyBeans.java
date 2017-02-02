/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package happybeans;

//class signature

import java.util.Scanner;

public class HappyBeans {

    //main method
    public static void main(String[] args) {
        boolean running = true;
        Scanner reader = new Scanner(System.in);
        int choice;
        
        while (running) {
        
            System.out.println("What would you like to do?");
            System.out.println("    1.) Help!");
            System.out.println("    2.) Manage Dealerships");
            System.out.println("    3.) Print Dealerships");
            System.out.println("    4.) QUIT");
        
            System.out.print("> ");
            choice = reader.nextInt();
            
            if (choice == 1) {
                System.out.println("You suck bro figure it out yoursrlf!!! ;)\n");
            }
            
            else if (choice == 2) {
                System.out.println("What would you like to do?");
                System.out.println("    1.) choose dealership");
                System.out.println("    2.) create new dealership");
                System.out.println("    3.) ..");
                
                while (true) {
                    System.out.print("> ");
                    choice = reader.nextInt();
                    
                    if (choice == 1) {
                        //TODO submenu
                    } else if (choice == 2) {
                        //TODO submenu
                    } else if (choice == 3) {
                        break;
                    }
                }
            }
            
            //TODO choice 3
            
            else if (choice == 4) {
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
    
}
