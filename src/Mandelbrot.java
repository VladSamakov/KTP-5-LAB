import java.awt.geom.Rectangle2D;

public class Mandelbrot extends FractalGenerator {
    private Complex z = new Complex(0, 0);
    private Complex c = new Complex(0, 0);
    public static final int MAX_ITERATIONS = 2000;



    public void getInitialRange(Rectangle2D.Double range) {
        range.setRect(-2, -1.5, 3,3);
    }

    public int numIterations(double x, double y) {
        z.real = 0; z.imag = 0; c.real = x; c.imag = y;
        for (int IterNum = 0; IterNum < MAX_ITERATIONS; IterNum++) {
            z = z.mul(z).sum(c);
            if (z.abs() > 4) return IterNum;
        }
        return -1;
    }

    @Override
    public String toString() {
        return "Mandelbrot";
    }
}
