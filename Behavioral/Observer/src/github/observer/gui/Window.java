package github.observer.gui;

import javax.swing.*;
import java.awt.*;

public class Window {

    private JFrame frame;

    public Window(String title, int width, int height) {
        frame = new JFrame();
        frame.setSize(width, height);
        frame.setLocation(600, 400);
        frame.setTitle(title);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());

        frame.add(new ChangeTemperaturePanel(), BorderLayout.CENTER);
        frame.add(new TextPanel(), BorderLayout.SOUTH);
    }

    public void show() {
        frame.setVisible(true);
    }
}
