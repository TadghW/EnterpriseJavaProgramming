import java.util.Scanner;

//here's the GeometricFigure2 subclass Octagon that implements ConsoleIO and
// ComparableGeometricFigure<Octagon>

public class Octagon extends GeometricFigure2 implements ConsoleIO, ComparableGeometricFigure<Octagon>{

//it requires variables for area and side

    double area;
    double side;

//by default these are set to zero
    public Octagon(){
        this.area = 0;
        this.side = 0;
    }

//although with an overloaded constructor we can the side value
//and then calculate the area
    public Octagon(double side){
        this.side = side;
        this.calcArea();
    }

//through which we can calculate the area
    public double calcArea(){  
        area = 2*(1 + Math.sqrt(2))*side*side;
        return area;
    }

//we can also update the side by initialising the updateFromConsole()
//method from our ConsoleIO interface  
    public void updateFromConsole(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the sides of the regular octagon:");
        double s = scanner.nextDouble();
        this.side = s;
        scanner.close();
     
    }

//we can also use our toString analogue here to to post the details
//of the octagon
    public void writeToConsole(){
        System.out.println("Octagon side: " + side + "\nOctagon Area: " + area);
    }

//the compareTo method only takes an object of GeometricFigure2, but
//in order to use the calcArea() function we have to make sure that 
//our parameter is cast as an Octagon
    @Override
    public int compareTo(GeometricFigure2 geo) { 
        if (calcArea() > ((Octagon)geo). calcArea())
            return 1;
        else if (calcArea() < ((Octagon)geo). calcArea())
            return -1;
        else
            return 0; 
    }
    public static void main(String arg[]){
    
        //We create two Octagons with a default instructor
        Octagon octagon1 = new Octagon();
        Octagon octagon2 = new Octagon();
        
        //Prompt the user for the side length of the first octagon
        //then calculate the area and print the result
        System.out.println("Octagon 1");
        octagon1.updateFromConsole();
        octagon1.calcArea();
        octagon1.writeToConsole();
    
        //Then we do the same thing for the second octagon
        System.out.println("Octagon 2");
        octagon2.updateFromConsole();
        octagon2.calcArea();
        octagon2.writeToConsole();
        
        //We can now compare Octagon 1 to Octagon 2 and print out
        //whichever is bigger. I chose to do this with a switch
    
        switch(octagon1.compareTo(octagon2)){
            case 1:
                System.out.println("Octagon 1 is bigger!");
                break;
            case 0:
                System.out.println("The octagons are the same size!");
                break;
            case -1:
                System.out.println("Octagon 2 is bigger!");
        }
    
    }
}
