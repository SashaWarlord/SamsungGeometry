public class rectangle extends geometryObjects {
    double a, b;

    public rectangle(double a, double b) {
        super();
        this.a = a;
        this.b = b;
    }

    @Override
    public double square() {
       return a * b;
    }

    @Override
    public void scale(double x) {
        a *= x;
        b *= x;
    }

    @Override
    public String toString() {
        return "rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
