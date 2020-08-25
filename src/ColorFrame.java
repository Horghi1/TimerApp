
import java.awt.*;
import javax.swing.*;

public class ColorFrame {

    static JFrame cf;
    static ImageIcon ii;

    static void startTimer() {
        cf = new JFrame();
        cf.setSize(300, 150);
        cf.setLocationRelativeTo(null);
        cf.getContentPane().setBackground(new Color(62, 62, 62));
        ii = new ImageIcon("timer.png");
        cf.setIconImage(ii.getImage());
        cf.setTitle("Timer Color Frame");
        cf.setVisible(true);
    }
}
