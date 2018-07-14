package level_5.solution5_19;

public class Rectangle {
    int left;
    int top;
    int width;
    int height;

    public Rectangle(int left, int top, int width, int height) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int left, int top) {
        this.left = left;
        this.top = top;
        this.width = this.height = 0;
    }

    public Rectangle(int left, int top, int width) {
        this.left = left;
        this.top = top;
        this.height = this.width = width;
    }

    public Rectangle(Rectangle rectangle) {
        this.left = rectangle.left;
        this.top = rectangle.top;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public static void main(String[] args) {

    }
}
