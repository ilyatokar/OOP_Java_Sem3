import javax.swing.*;
import java.awt.*;

public class Image extends JFrame {
    private JLabel jLabel;

    public Image(String args[]) {
        super("Отбражение картинк из аргументов");
        setSize(260,210);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        if(args.length != 0){
            ImageIcon img = new ImageIcon(args[0]);
            System.out.println(args[0]);
            jLabel = new JLabel("", img, JLabel.CENTER);
        }
        else{
            jLabel = new JLabel("D аргументах не передан путь к файлу", JLabel.CENTER);
        }

        add(jLabel);
        setVisible(true);
    }
}