public class Main {
    public static void main(String[] args) {
        Shape[] arr = new Shape[4];
        arr[0] = new Circle(5, "red", true);
        arr[1] = new Rectangle(4,7,"red", false);
        arr[2] = new Square(12,"white",true);
        arr[3] = new Square(5,"blue",false);

        for (Shape shape : arr) {
            System.out.println(shape);
        }
    }
}
