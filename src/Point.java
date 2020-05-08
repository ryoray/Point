public class Point {

    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    public double distance() {
        return Math.sqrt(((this.getX()) * (this.getX()) + (this.getY()) * (this.getY())));
    }

    public double distance (int x, int y) {
        return Math.sqrt((this.getX() - x) * (this.getX() - x) + (this.getY() - y) * (this.getY() - y));
    }

    public double distance(Point another) {
        return Math.sqrt((this.getX() - another.getX()) * (this.getX() -
                another.getX()) + (this.getY() - another.getY()) * (this.getY() - another.getY()));
    }
}
