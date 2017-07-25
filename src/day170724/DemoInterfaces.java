package day170724;

import javax.swing.*;
import java.awt.*;

public class DemoInterfaces {
    public static void main(String[] args) {

        JFrame frame = new JFrame("Demo");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();

        panel.addMouseListener(new MyMouseListener());

        panel.setPreferredSize(new Dimension(400, 400));
        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}

