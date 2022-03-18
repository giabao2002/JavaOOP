public class Main {
    public static void main(String[] args) {
        Point A = new Point(0, 0);
        Point B = new Point(0, 3);
        Point C = new Point(4, 0);

        Triangle ABC = new Triangle(A, B, C);
        if (ABC.isTriangle()) {
            System.out.println("This is Triangle");
            System.out.println("C = " + ABC.C());
            System.out.println("S = " + ABC.S());
        } else {
            System.out.println("This is not Triangle");
        }
    }
}

