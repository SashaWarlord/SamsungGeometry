import static java.lang.Math.sqrt;

public class triangle extends geometryObjects {
    double a, b, c;

    public triangle(double a, double b, double c) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }


    @Override
    public double square() {
        double p = (a + b + c) / 2;
        return (sqrt(p * (p - a) * (p - b) * (p - c)));
    }

    @Override
    public void scale(double x) {
        a *= x;
        b *= x;
        c *= x;
    }

    @Override
    public String toString() {
        return "triangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
