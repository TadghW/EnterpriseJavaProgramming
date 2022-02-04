//NumberInt extends Number but has implements the getNumber() method in such a way that it returns a double without type casting
//For that I used the Double.valueOf method 
public class NumberInt extends Number{
        
    private int numberInt;

    //Default constructor
    public NumberInt(){
        numberInt = 0;
    }

    //Overloaded constructor
    public NumberInt(int numberInt){
        this.numberInt = numberInt;
    }

    public double getNumber(){
        return Double.valueOf(numberInt);
    }
}
