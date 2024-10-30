public class Triangle extends Figure implements Printing {

    private double a, b, c;
    private double p = 0;

    Triangle(double a1, double b1, double c1) {
        a = a1;
        b = b1;
        c = c1;
    }

    @Override
    public double calculateArea() {
        p = 0.5 * (a + b + c);

        if (isValidTriangle()) {
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else {
          //  System.out.println("Error: Invalid triangle sides.");
            return -1;
        }
    }

    @Override
    public double calculatePerimeter() {
        if (isValidTriangle()) {
            return a + b + c;
        } else {
          //  System.out.println("INVALID VALUES");
            return -1;
        }
    }

    private boolean isValidTriangle() {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    @Override
    public void print() {
        double area = calculateArea();
        double perimeter = calculatePerimeter();

        if (area >= 0 && perimeter >= 0) {
            System.out.println("Area: " + area);
            System.out.println("Perimeter: " + perimeter);
        } else {
            System.out.println("Cannot calculate area and perimeter. Please enter VALID VALUES");
        }
    }
}
