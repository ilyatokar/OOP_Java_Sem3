public class Circle extends Shape {

    protected double radius;

    Circle()
    {

    }
    Circle(double radius)
    {
        this.radius = radius;
    }

    Circle(double radius, String color, Boolean fiiled)
    {
        this.radius = radius;
        this.color = color;
        this.filled = fiiled;
    }
    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }
    @Override
    public double getPerimeter()
    {
        return Math.PI * radius * 2;
    }
    @Override
    public double getArea()
    {
        return Math.PI * Math.pow(radius, 2);
    }
    @Override
    public String toString()
    {
        return "Shape: circle, radius: " + this.radius + ", color: " + this.color + ", perimeter: " + getPerimeter() + ", area: " + getArea();
    }

}