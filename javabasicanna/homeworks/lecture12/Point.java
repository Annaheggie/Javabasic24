package javabasicanna.homeworks.lecture12;


public class Point implements Cloneable {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setCoordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distanceTo(Point other) {
        return Math.sqrt(Math.pow(this.x - other.x, 2) + Math.pow(this.y - other.y, 2));
    }

    public static double distanceBetween(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point other = (Point) obj;
        return this.x == other.x && this.y == other.y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public Point clone() {
        return new Point(this.x, this.y);
    }

    public static void main(String[] args) {
        Point p1 = new Point(1, 2);
        Point p2 = new Point(3, 4);

        System.out.println("Point 1: " + p1);
        System.out.println("Point 2: " + p2);

        System.out.println("Distance between Point 1 and Point 2: " + Point.distanceBetween(p1, p2));

        Point p3 = p1.clone();
        System.out.println("Cloned Point 1: " + p3);

        System.out.println("Are Point 1 and Point 2 equal? " + p1.equals(p2));
    }
}