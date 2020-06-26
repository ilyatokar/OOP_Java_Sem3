public class Square extends Rectangle{
    protected double side;

    Square()
    {

    }
    Square(double side)
    {
        this.side = side;
    }
    Square(double side, String color, Boolean filled)
    {
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide()
    {
        return side;
    }
    public void setSide(double side)
    {
        this.side = side;
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public String toString()
    {
        setLength(side);
        setWidth(side);
        return "Shape: square, side: " + this.side + ", color: " + this.color + ", perimeter: " + getPerimeter() + ", area: " + getArea();
    }
}