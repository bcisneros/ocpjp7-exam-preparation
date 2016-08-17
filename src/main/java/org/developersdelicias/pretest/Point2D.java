package org.developersdelicias.pretest;

import static java.lang.String.format;

public class Point2D {

    private int x, y;

    public Point2D(int x, int y) {
        x = x;
    }

    @Override
    public String toString() {
        return format("[%d, %d]", x, y);
    }

    public static void main(String[] args) {
        Point2D point = new Point2D(10, 20);
        Point2D point2 = new Point2D(15, 78);
        // It will always print [0, 0] because you are not assigning to the x and y of Point2D object
        System.out.println(point);
        System.out.println(point2);

    }
}
