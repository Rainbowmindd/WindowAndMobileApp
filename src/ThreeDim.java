public class ThreeDim extends Figure implements Printing{
    private final Figure base;
    private final double h;

    public ThreeDim(Figure base, double h){
        this.base=base;
        this.h=h;
    }

    public double calculatePerimeter() {

        return 0;
    }

    @Override
    public double calculateArea() {
        //Pole powierzchni bocznej=obwod*wysokosc +2*pp
        return base.calculatePerimeter()*h + 2*base.calculateArea();
    }

    public double calculateVolume(){
        //v=pp*h
        return base.calculateArea()*h;
    }

    @Override
    public void print() {
        System.out.println("3D figure with base: ");
        if (base instanceof Printing) {
            ((Printing) base).print();
        } else {
            System.out.println("Base does not support printing.");
        }
        System.out.println("Height: " + h);
        System.out.println("Surface area: " + calculateArea());
        System.out.println("Volume: " + calculateVolume());
    }
}
