import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class GameFrame extends JFrame {
    private JButton checkNumber = new JButton("SUBMIT");
    private JFormattedTextField enterNumber = new JFormattedTextField();

    private ClassLoader loadRes = this.getClass().getClassLoader();

    private int life = 3;

    GameFrame() {
        int digit = (int) (Math.random() * 20);
        System.out.println(digit);
        this.setSize(300, 150);
        this.setResizable(false);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Guessing game");
        this.setLayout(null);


        enterNumber.setBounds(45, 20, 200,20);
        this.add(enterNumber);
        checkNumber.setBounds(45, 45, 200,30);
        this.add(checkNumber);



        checkNumber.addActionListener((ActionEvent e) -> {
            if (life != 1) {
                try {
                    if (Integer.parseInt(enterNumber.getText()) < digit) {
                        life--;
                        JOptionPane.showMessageDialog(this, "WRONG! DIGIT" +
                                " IS LARGER. YOU HAVE " + life + " LIFE.");
                    } else if (Integer.parseInt(enterNumber.getText()) > digit) {
                        life--;
                        JOptionPane.showMessageDialog(this, "WRONG! DIGIT" +
                                " IS SMALLER. YOU HAVE " + life + " LIFE.");
                    } else if (Integer.parseInt(enterNumber.getText()) == digit) {
                        JOptionPane.showMessageDialog(this, "YOU WIN!");
                        System.exit(0);
                    }

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "YOU SHOULD " +
                            "ENTER THE NUMBER");
                }
            }
            else {
                JOptionPane.showMessageDialog(this, "YOU LOSE!");
                System.exit(0);
            }
        });
    }

}