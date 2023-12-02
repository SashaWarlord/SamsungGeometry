import java.awt.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//        String[] array = new String[] { "5", "3", "7", "8", "10"};
//        Arrays.sort(array, new StringComparator());
//        System.out.println(Arrays.toString(array));
//
//        Pelmen[] pelmens = new Pelmen[]{new Pelmen(100, Color.CYAN, "Miratorg"), new Pelmen(99, Color.magenta, "Red cost")};
//        Arrays.sort(pelmens);
//        System.out.println(Arrays.toString(pelmens));

        geometryObjects[] objects = new geometryObjects[]{new rectangle(10, 5), new triangle(3, 4, 5), new circle(6)};
        Arrays.sort(objects);
        System.out.println(Arrays.toString(objects));

        objects[0].scale(3);
        Arrays.sort(objects);
        System.out.println(Arrays.toString(objects));

        objects[1].scale(1.5);
        Arrays.sort(objects);
        System.out.println(Arrays.toString(objects));


    }
}