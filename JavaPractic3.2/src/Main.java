public class Main {
    public static void main(String[] args) {
        Movable H = new MovablePoint(2,5,2,2);
        Movable B = new MovableCircle(10, 2, 5,5, 15);
        System.out.println(H);

        H.moveUp();
        H.moveLeft();

        System.out.println(H);

        H.moveDown();
        H.moveRight();

        System.out.println(H);

        System.out.println();

        System.out.println(B);

        B.moveUp();

        System.out.println(B);

        B.moveLeft();

        System.out.println(B);
    }
}
