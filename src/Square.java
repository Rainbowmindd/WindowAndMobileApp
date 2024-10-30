import java.util.SortedMap;

public class Square extends Figure implements Printing{

    public double a;

    Square(double x){
        a=x;
    }


    @Override
     public double  calculateArea() {
        if(isValidValue()){
            return a*a;
        }
        else{
            System.out.println("INVALID VALUES");
            return -1;
        }
    }

    @Override
    public double calculatePerimeter() {
        if(isValidValue()){
            return 4*a;
        }
        else{
            System.out.println("INVALID VALUES");
            return -1;
        }

    }

    private boolean isValidValue(){
        return a>0;
    }
    @Override
    public void print() {
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}
