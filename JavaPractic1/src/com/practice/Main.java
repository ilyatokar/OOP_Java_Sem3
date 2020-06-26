package com.practice;

public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("Книга 1", 1000);
        System.out.println(b1);
        Book b2 = new Book();
        System.out.println(b2);

        System.out.println();

        Ball ball = new Ball(100, 100);
        System.out.println(ball);
        ball.move(30, 15);
        System.out.println(ball);
    }
}
