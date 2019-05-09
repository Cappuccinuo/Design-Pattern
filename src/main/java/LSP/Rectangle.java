package LSP;

public class Rectangle {
    protected int width;
    protected int height;

    public Rectangle() {

    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "width=" + width + ", height=" + height + "}";
    }

    public int getArea() {
        return width * height;
    }

    public boolean isSquare() {
        return height == width;
    }
}
