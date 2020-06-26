public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center = new MovablePoint(0,0,0,0);

    MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        this.center.x = x;
        this.center.y = y;
        this.center.ySpeed = ySpeed;
        this.center.xSpeed = xSpeed;
        this.radius = radius;
    }

    @Override
    public String toString()
    {
        return "Speed: " + center.xSpeed + ";" + center.ySpeed + " Locate of circle: " + this.center.x + "; " + this.center.y + ", Radius: " + radius;
    }

    public void moveUp() {
        center.y += center.ySpeed;
    }

    public void moveDown() {
        center.y -= center.ySpeed;
    }

    public void moveRight() {
        center.x += center.xSpeed;
    }

    public void moveLeft() {
        center.x -= center.xSpeed;
    }
}
