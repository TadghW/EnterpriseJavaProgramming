//Abstract class GeometricFigure2, as given in the lecture slides of lecture 1b
abstract class GeometricFigure2 {
       
        public static final double PI = 3.141592653;
       
        private boolean filled;
        
        public GeometricFigure2() {
        filled = false;
        }
        
        public boolean isFilled() {
        return filled;
        }
        
        public void setFilled(boolean filled) {
        this.filled = filled;
        }
       
        public void display() {
        System.out.println("This is some geometric figure.");
        }
        
        public abstract double calcArea();

}

