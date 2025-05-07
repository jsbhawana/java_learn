class Quadratic {
    private double a, b, c;

    // Make the method public so it can be called from outside the class
    public void setCoefficient(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void displayRoots() {
        double det = Math.pow(this.b, 2) - 4 * this.a * this.c;

        if (det > 0) {
            double x1 = (-this.b + Math.sqrt(det)) / (2 * this.a);
            double x2 = (-this.b - Math.sqrt(det)) / (2 * this.a);
            System.out.println("Roots are real and different");
            System.out.println("Roots are " + x1 + " and " + x2);
        } else if (det == 0) {
            double x = -this.b / (2 * this.a);
            System.out.println("Roots are real and same");
            System.out.println("Root is " + x);
        } else {
            double realPart = -this.b / (2 * this.a);
            double imagPart = Math.sqrt(-det) / (2 * this.a);
            System.out.println("Roots are complex and different");
            System.out.println("Roots are " + realPart + " + " + imagPart + "i and " +
                               realPart + " - " + imagPart + "i");
        }
    }
}

public class Demo5 {
    public static void main(String[] args) {
        Quadratic q = new Quadratic();
        q.setCoefficient(4, 3, 2); // This is valid now
        q.displayRoots();
    }
}
