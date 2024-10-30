import java.sql.SQLOutput;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String program;

        do {
            System.out.println("Choose a figure: ");
            System.out.println("1: Square");
            System.out.println("2: Triangle");
            System.out.println("3: Circle");
            System.out.println("4: ThreeDim");
            System.out.println("5: Exit Program");


            String figura = scanner.nextLine();

            switch (figura) {
                case "1":
                    System.out.println("You chose a SQUARE. Please enter the SIDE LENGTH ");
                    double a = scanner.nextDouble();
                    Square s = new Square(a);
                    s.print();
                    break;

                case "2":
                    System.out.println("You chose a TRIANGLE. Please enter the LENGTHS OF THE SIDES: ");
                    double a1 = scanner.nextDouble();
                    double b1 = scanner.nextDouble();
                    double c1 = scanner.nextDouble();
                    Triangle t = new Triangle(a1, b1, c1);
                    t.print();
                    break;
                case "3":
                    System.out.println("You chose a CIRCLE. Please enter the RADIUS: ");
                    double r = scanner.nextDouble();
                    Circle c = new Circle(r);
                    c.print();
                    break;
                case "4":
                    System.out.println("You chose a 3D FIGURE  . Please choose the BASE of the figure");
                    System.out.println("Choose a figure: ");
                    System.out.println("1: Square");
                    System.out.println("2: Triangle");
                    System.out.println("3: Circle");

                    String base = scanner.nextLine();
                    Figure base1 = null;

                    switch (base) {
                        case "1":
                            System.out.println("Enter the SIDE LENGTH of the SQUARE base:");
                            double a2 = scanner.nextDouble();
                            base1 = new Square(a2);
                            break;
                        case "2":
                            System.out.println("Enter the LENGTHS OF THE TRIANGLE SIDES:");
                            double a3 = scanner.nextDouble();
                            double b3 = scanner.nextDouble();
                            double c3 = scanner.nextDouble();
                            base1 = new Triangle(a3, b3, c3);
                            break;
                        case "3":
                            System.out.println("Enter the RADIUS of the CIRCLE base:");
                            double r1 = scanner.nextDouble();
                            base1 = new Circle(r1);
                            break;
                        default:
                            System.out.println("NULL");
                            break;
                    }
                    if (base1 != null) {
                        System.out.println("Enter the HEIGHT of the 3D figure:");
                        double height = scanner.nextDouble();
                        ThreeDim threeDim = new ThreeDim(base1, height);
                        threeDim.print();
                    }
                    break;

                case "5":
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Choose the figure AGAIN. ");
                    break;
            }

            scanner.nextLine();

            System.out.println("Do you want to calculate another figure? (y/n)");
            program = scanner.nextLine();

        } while (program.equalsIgnoreCase("y"));

            System.out.println("##################END##################");
    }
}

