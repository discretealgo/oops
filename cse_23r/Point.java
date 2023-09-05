import java.lang.Math;
 
class Point {
    private double x;
    private double y;
 
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
 
    public double getX() {
        return x;
    }
 
    public double getY() {
        return y;
    }
 
    public static double calculateDistance(Point p1, Point p2) {
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
 
    public static void main(String[] args) {
        Point point1 = new Point(8.0, 9.0);
        Point point2 = new Point(6.0, 1.0);
 
        double distance = Point.calculateDistance(point1, point2);
        System.out.println("Distance between the points: " + distance);
    }
}