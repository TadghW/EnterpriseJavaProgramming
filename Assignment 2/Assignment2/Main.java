package Assignment2;

import java.util.Random;

public class Main {

    public static void main(String[] args){

        //When we create a buyer or seller they must be assigned to a certain showroom in their constructor parameters
        //So to start we have to make a showroom to assign them to
        CarShowroom showroom = new CarShowroom();

        int day = 0;
        while(day<30){
            Random rand = new Random();
            System.out.println("Day " + ++day + " has begun.");
            
            for(int i = 0; i < rand.nextInt(4); i++){  
                Thread thread = new Thread(new Seller(showroom));
                thread.start();
            }

            for(int i = 0; i < rand.nextInt(4); i++){
                Thread thread = new Thread(new Buyer(showroom));
                thread.start();
            }
        
        }

    }   
}