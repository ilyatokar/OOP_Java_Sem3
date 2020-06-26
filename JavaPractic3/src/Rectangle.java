public class Rectangle extends Shape{
    protected double width;
    protected double length;
    Rectangle()
    {

    }
    Rectangle(double width, double length)
    {
        this.width = width;
        this.length = length;
    }
    Rectangle(double width, double length, String color, Boolean filled)
    {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth()
    {
        return width;
    }
    public  double getLength()
    {
        return length;
    }
    public void setWidth(double width)
    {
        this.width = width;
    }
    public void setLength(double length)
    {
        this.length = length;
    }

    @Override
    public double getArea()
    {
        return length * width;
    }

    @Override
    public double getPerimeter()
    {
        return 2 * (length + width);
    }
    @Override
    public String toString()
    {
        return "Shape: rectangle, width: " + this.width + ", lenght: " + this.length +", color: " + this.color + ", perimeter: " + getPerimeter() + ", area: " + getArea();
    }
}