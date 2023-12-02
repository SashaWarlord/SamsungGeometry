import static java.lang.Math.PI;

public class circle extends geometryObjects{
    double r;

    public circle(double r) {
        super();
        this.r = r;
    }

    @Override
    public double square() {
        return PI * r * r;
    }

    @Override
    public void scale(double x) {
        r *= x;
    }

    @Override
    public String toString() {
        return "circle{" +
                "r=" + r +
                '}';
    }
}
