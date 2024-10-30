public class Circle extends Figure implements Printing{

    public double r;

    Circle(double r1){
        r=r1;
    }
    @Override
    public double calculateArea() {
        if(isValidValue()){
            return Math.PI * Math.pow(r,2);
        }
        else{
            System.out.println("INVALID VALUES");
            return -1;
        }

    }

    @Override
    public double calculatePerimeter() {
        if(isValidValue()){
            return 2*Math.PI*r;
        }
        else{
            System.out.println("INVALID VALUES");
            return -1;
        }

    }

    public boolean isValidValue(){
        return r>0;
    }

    @Override
    public void print() {
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());

    }
}
