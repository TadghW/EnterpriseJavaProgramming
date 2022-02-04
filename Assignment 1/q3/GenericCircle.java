//Generic subclass of GeometricFigure3 which takes a parameter of T (which is any subclass of the abstract class Number)
public class GenericCircle <T extends Number> extends GeometricFigure3{

    //Now, instead of typing radius as a double we type it as a T 
    private T radius;
    private double area; 
    NumberDouble areaCalc;
    private double r;

    //Overloaded Constructor visa vis "Circle" in lecture notes
    public GenericCircle(T radius) {
        this.radius = radius;
    }

    //Getter for Area
    public double getArea() {
        return area;
    }

    //Method to display the objects properties in the console
    public void display() {
        System.out.println("Object is a circle with radius: " + radius.getNumber() + " and an area of " + areaCalc.getNumber()); 
    }

    //Implementation of abstract method calcArea()
    public NumberDouble calcArea(){
        r = radius.getNumber();
        area = r*r*PI;
        areaCalc = new NumberDouble(area);
        return areaCalc;
    }
}