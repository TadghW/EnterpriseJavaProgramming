package Assignment2;

import java.util.ArrayList;

public class CarShowroom {

    private int capacity;
    private ArrayList<Car> cars;

    CarShowroom(){
        this.capacity = 10;
        this.cars = new ArrayList<Car>();
    }

    public int size(){
        return this.cars.size();
    }

    public boolean isEmpty(){
        if(this.cars.size() > 0){
            return false;
        } else {
            return true;
        }
    }

    public boolean isFull(){
        if(this.cars.size() >= capacity){
            return true;
        } else {
            return false;
        }
    }

    public void addCar(Car car){
        this.cars.add(car);
    }

    public Car takeCar(){
        Car car = this.cars.get(0);
        this.cars.remove(0);
        return car;
    }
}
