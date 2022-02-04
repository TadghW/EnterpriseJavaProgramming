//NumberDouble is a subclass of NumberDouble which can natively return it's stored double value with the getNumber() method.
public class NumberDouble extends Number {
    
    private double numberDouble;

    //Default constructor
    public NumberDouble(){
        numberDouble = 0;
    }
    
    //Overloaded constructor
    public NumberDouble(double numberDouble){
        this.numberDouble = numberDouble;
    }

    public double getNumber(){
        return numberDouble;
    }
}
