package view;

import javax.swing.*;
import java.awt.*;

public class SnakeGUI extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.WHITE);
        for (int length = 5; length > 0; length--) {
            g2.fillRect(25 + length * 27, 50, 25, 25);
        }
        Rectangle head = new Rectangle();
        head.setBounds(325, 50, 50, 50);
        g2.setColor(Color.RED);
        g2.fillRect(162 + 25, 50, 25, 25);

        //g2.draw(head);
    }

}
