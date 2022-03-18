public class Point {
    private double x;
    private double y;
    
    public Point() {
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(Point another) {
        return Math.sqrt(Math.pow(this.x - another.x, 2) + Math.pow(this.y - another.y, 2));
    }

    public double C(Point A, Point B) {
        double a = this.distance(B);
        double b = this.distance(A);
        double c = A.distance(B);

        return a + b + c;
    }

    public boolean isTriangle(Point A, Point B) {
        double a = this.distance(B);
        double b = this.distance(A);
        double c = A.distance(B);
        return Math.max(a, Math.max(b, c)) < this.C(A, B)/2;
    }

    public double S(Point A, Point B) {
        // p = C/2;
        // S = sqrt(p*(p-a)*(p-b)*(p-c))
        double p = this.C(A, B) / 2;
        double a = this.distance(B);
        double b = this.distance(A);
        double c = A.distance(B);

        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    
}

