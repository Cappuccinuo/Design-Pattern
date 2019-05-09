package LSP;

public class Demo {
    static void useIt(Rectangle r) {
        int width = r.getWidth();
        r.setHeight(10);
        System.out.println("Expected area of " + (width * 10) + ", got " + r.getArea());
    }

    public static void main(String[] args) {
        Rectangle rc = new Rectangle(2, 3);
        useIt(rc);

        Rectangle sq = new Square();
        sq.setHeight(5);
        useIt(sq);

        System.out.println("new");

        Rectangle sq1 = RectangleFactory.newSquare(5);
        useIt(sq1);
    }
}
