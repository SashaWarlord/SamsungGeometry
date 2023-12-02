abstract class geometryObjects implements Comparable<geometryObjects> {
    public abstract double square();

    public abstract void scale(double x);

    public int compareTo(geometryObjects o) {
        if (this.square() > o.square()) return 1;
        else if (this.square() < o.square()) return -1;
        return 0;
    }
}
