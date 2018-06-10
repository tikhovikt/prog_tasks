import java.util.ArrayList;
import java.util.Formatter;

import static java.lang.String.format;


class FunctionTg {
    private double a;
    private double b;
    private double h;
    private int steps;
    private ArrayList<Double[]> table = new ArrayList<>();

    FunctionTg(double a, double b, double h) {
        this.a = a;
        this.b = b;
        this.h = h;
    }

    void initialize() {
        steps = (int)Math.abs((a-b)/h);
        for (int i=0 ; i<steps ; i++) {
            table.add(new Double[2]);
            table.get(i)[0] = a+i*h;
            table.get(i)[1] = Math.tan(2.0*(a+i*h))-3.0;
            }
        table.add(new Double[2]);
        table.get(steps)[0] = b;
        table.get(steps)[1] = Math.tan(2.0*(b))-3.0;
    }

    void printTable() {
        Formatter formatter = new Formatter();
        for (Double[] element: table) {
            formatter.format("x: %1$#8.3f ; f(x): %2$#8.3f%n", element[0],element[1]);
        }
        System.out.println(formatter);
    }
}
