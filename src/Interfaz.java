import javax.swing.*;

public class Interfaz {
    private JPanel panel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Interfaz Test");
        frame.setContentPane(new Interfaz().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
