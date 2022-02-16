package Assignment2;
import java.util.concurrent.atomic.AtomicInteger;
public class Seller implements Runnable {
    
    //AtomicIntegers are integers upon which atomic operations (incrementing or decrementing) can be performed
    //across threads. In this case we can create multiple buyers/sellers and have them all refer to the same
    //counter such that we can assign them IDs
    private static AtomicInteger sellerCounter = new AtomicInteger();
    private int id;
    private CarShowroom showroom;
    private Car car;

    Seller(CarShowroom showroom){
        this.id = sellerCounter.getAndAdd(1);
        this.showroom = showroom;
        this.car = new Car();
    }

    public void run(){

       System.out.println("Seller #" + id + " has entered the dealership. They wish to sell a " + car);

       //The synchronized keyword tells Java that you're using a resource that is accessed by multiple threads
       //it tells the JVM to ensure that multiple threads don't both try and act on a resource at once.

       //In our example, it ensures that two buyers don't try to buy a car at once, or that two sellers don't 
       //come in at the same time trying to sell to a warehouse with only one space left, causing errors.

       //In our run command, we make the sellers check that the showroom isn't full before attempting to sell
       //their car

       synchronized(showroom){
            
            //Check this before doing anything else!
            while(showroom.isFull()){

                System.out.println("The showroom is full, seller #" + id + " is waiting for a space to open up...");
                
                //The wait function can be used to tell a thread not to operate on the communal resource until it
                //declare that it's ready to be worked on again via the notify() or notifyAll() functions
                
                //wait() has to be wrapped in a try-catch block

                try{showroom.wait();}catch(InterruptedException e){System.out.println(e);}
            }
        }

        //Assuming that the showroom was not full on arrival or that the thread has been notified that it may now continue
        //our seller can put their car up for sale in the showroom
        synchronized(showroom){
            System.out.println("Seller #" + id + " has sold their car for " + car.getValue());
            showroom.addCar(car);
            showroom.notify();
        }
     
        return;

    }

}
