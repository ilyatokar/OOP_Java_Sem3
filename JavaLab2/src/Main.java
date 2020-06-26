import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Circle c1 = new Circle(3.1, 4.1, 5.1, "\u001B[31m");
        System.out.println("Длина окружности = " + c1.getLength() + "cm");
        System.out.print("Введите радиус окружности: ");
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        try {
            c1.setR(b.read());
        }catch (IOException ex){
            System.out.println("Ошибка вводимых данных");
        }
        System.out.println("Длина окружности = " + c1.getLength() + "cm");
    }
}
