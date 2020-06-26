import java.io.FileWriter;
import java.io.IOException;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.print("Введите текст для записи: ");
        String text = null;
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        try {
            text = b.readLine();
        }catch (IOException ex){
            System.out.println("Ошибка вводимых данных");
        }
        try
        {
            FileWriter writer = new FileWriter("file.txt", false);
            writer.write(text);
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
