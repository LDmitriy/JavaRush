package level_5.solution5_11;

public class Rectangle {
    int top;
    int left;
    int width;
    int height;

    public void initialize(int top, int left, int width, int height) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize(int top, int left) {
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public void initialize(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public void initialize(Rectangle aniRectangle) {
        this.top = aniRectangle.top;
        this.left = aniRectangle.left;
        this.width = aniRectangle.width;
        this.height = aniRectangle.height;
    }

    public static void main(String[] args) {

    }
}
