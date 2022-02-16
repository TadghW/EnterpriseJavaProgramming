package Assignment2;
import java.util.Random;
public class Car{

    static final String[] colours = {"white", "black", "purple", "orange", "2006 Ford Fiesta Green w the spoiler"};
    private String registration;
    private int saleValue;
    private String colour;

   
    Car(){
        this.registration = generateReg();
        this.saleValue = generateValue();
        this.colour = generateColour();
    }

    private String generateReg(){
        Random rand = new Random();
        int lowerbound1 = 10;
        int upperbound1 = 22;
        int lowerbound2 = 1000;
        int upperbound2 = 9999;
        int year = rand.nextInt(upperbound1 - lowerbound1) + lowerbound1;
        int id = rand.nextInt(upperbound2 - lowerbound2) + lowerbound2;
        return year + "-G-" + id;
    }

    private int generateValue(){
        Random rand = new Random();
        int lowerbound = 1000;
        int upperbound = 20000;
        int value = rand.nextInt(upperbound - lowerbound) + lowerbound;
        return value;
    }

    private String generateColour(){
        Random rand = new Random();
        int index = rand.nextInt(5);
        String colour = colours[index];
        return colour;
    }

    public int getValue(){
        return this.saleValue;
    }

    @Override
    public String toString(){
        return colour + " car with the registration " + registration + " worth e" + saleValue;
    }
}