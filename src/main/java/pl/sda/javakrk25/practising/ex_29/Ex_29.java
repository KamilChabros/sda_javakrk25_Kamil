package pl.sda.javakrk25.practising.ex_29;

public class Ex_29 {

    // Najbliższy i najdalszy punkt od podanego

    /**
     * Napisać program, który:
     * a) oblicza odległości między 2 punktami w układzie współrzędnych
     * b) wyszukuje najbliższy i najdalszy punkt od podanego
     */

    public static void main(String[] args) {
        Point[] points = {new Point(2, 5), new Point(-5, -7), new Point(-1, -1), new Point(3, 1), new Point(-3, 5)};
        Point a = new Point(1, 1);
        Point b = new Point(3, 2);
        System.out.println(String.format("Distance is %f", distance(a, b)));
        Point closest = closest(points, a);
        Point farest = farest(points, b);
        System.out.println(String.format("Closest point to a is: %.2f, %.2f", closest.x, closest.y));
        System.out.println(String.format("Farest point to a is: %.2f, %.2f", farest.x, farest.y));

    }

    public static Point closest(Point[] points, Point refPoint) {
        double minDistance = Double.MAX_VALUE;
        Point closestPoint = null;
        for (Point p : points) {
            double distance = distance(p, refPoint);
            if (minDistance > distance) {
                minDistance = distance;
                closestPoint = p;
            }
        }
        return closestPoint;
    }

    public static Point farest(Point[] points, Point refPoint) {
        double maxDistance = 0;// lub Double.MIN_VALUE
        Point farestPoint = null;
        for (Point p : points) {
            double distance = distance(p, refPoint);
            if (maxDistance < distance) {
                maxDistance = distance;
                farestPoint = p;
            }
        }
        return farestPoint;
    }

    public static double distance(Point a, Point b) {
        return Math.sqrt(Math.pow(b.x - a.x, 2) + Math.pow(b.y - a.y, 2));
    }

    static class Point {
        double x, y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }
    }
}
