import java.util.*;
class Rectangle {
    private double len, bre;

    public void setDimension(double len, double bre) {
        this.len = len;
        this.bre = bre;
    }

    public double getArea() {
        return (len * bre);
    }

    public double getPerimeter() {
        return 2 * (len + bre);
    }
}

public class Demo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length and breadth:");
        double l = sc.nextDouble();
        double b = sc.nextDouble();

        Rectangle r = new Rectangle();
        r.setDimension(l, b);

        double res_area = r.getArea();
        double res_perimeter = r.getPerimeter();

        System.out.println("Area = " + res_area);
        System.out.println("Perimeter = " + res_perimeter);
    }
}
