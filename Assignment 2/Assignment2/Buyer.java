package Assignment2;
import java.util.concurrent.atomic.AtomicInteger;

public class Buyer implements Runnable {
    
    private static AtomicInteger buyerCounter = new AtomicInteger();
    private int id;
    private CarShowroom showroom;
    
    Buyer(CarShowroom showroom){
        this.id = buyerCounter.getAndAdd(1);
        this.showroom = showroom;
    }
    
    public void run(){
        
        System.out.println("Buyer #" + this.id + " has entered the dealership");
        
        synchronized(showroom){
            while(showroom.isEmpty()){
                System.out.println("The showroom is empty, buyer #" + id + " is waiting to buy a car");
                try{showroom.wait();}catch(InterruptedException e){System.out.println(e);}
            }
        }

        synchronized(showroom){
            Car car = showroom.takeCar();
            System.out.println("Buyer #" + id + " has purchased a " + car + " for " + (car.getValue()*1.2) + " (after dealership markup)");
            showroom.notify();
            return;
        }
        
    }
}
