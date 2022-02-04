//Superclass
abstract class GeometricFigure3{

            //PI is a constant needed to calculate the area of a circle
            public static final double PI = 3.141592653;
           
            private boolean filled;
            
            //GeometricFigure3 objects are by default unfilled. This can be modified by calling
            //the isFilled() method.
            public GeometricFigure3() {
            filled = false;
            }
            
            public boolean isFilled() {
            return filled;
            }
            
            public void setFilled(boolean filled) {
            this.filled = filled;
            }
           
            public void display() {
            System.out.println("This is as geometric figure.");
            }
            
            //calcArea() must now be implemented in any non-abstract subclass of GeometricFigure3 
            public abstract NumberDouble calcArea();
    
        }