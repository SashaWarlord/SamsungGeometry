import java.awt.*;

public class Pelmen implements Comparable<Pelmen> {


    int size;
    Color color;
    String vendor;

    public Pelmen(int size, Color color, String vendor) {
        this.size = size;
        this.color = color;
        this.vendor = vendor;
    }

    @Override
    public int compareTo(Pelmen o) {
        if(this.size > o.size) return 1;
        else if(this.size < o.size) return -1;

        int colorInt1 = this.color.getRed() + this.color.getGreen() + this.color.getBlue();
        int colorInt2 = o.color.getRed() + o.color.getGreen() + o.color.getBlue();

        if (colorInt1 > colorInt2) return 1;
        else if (colorInt1 < colorInt2) return -1;

        return  this.vendor.compareTo(o.vendor);
    }

    @Override
    public String toString() {
        return "Pelmen{" +
                "size=" + size +
                ", color=" + color +
                ", vendor='" + vendor + '\'' +
                '}';
    }
}
