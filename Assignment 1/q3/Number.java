//Abstract class Number with abstract method getNumber()
abstract class Number{

    //Must be implemented by anny subclasses
    abstract public double getNumber();

    public static void main(String args[]){

        //Creating Circle 1 and calculating/displaying its area
        System.out.println("Circle 1");
        NumberDouble radius1 = new NumberDouble(6.9);
        GenericCircle<NumberDouble> circle1 = new GenericCircle<NumberDouble>(radius1);
        circle1.calcArea();
        circle1.display();

        //Creating Circle 2 and calculating/displaying its area
        System.out.println("Circle 2");
        NumberInt radius2 = new NumberInt(6);
        GenericCircle<NumberInt> circle2 = new GenericCircle<NumberInt>(radius2);
        circle2.calcArea();
        circle2.display();

    }

}