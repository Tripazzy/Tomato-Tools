package salsaboy.tomatotool.graphics;

import javax.swing.*;
import java.awt.*;

/**
 * A class which creates a JFrame while automating some things like making the frame visible.
 */
public class Window extends JFrame {
    public Window(int width, int height) {
        this(width, height, null);
    }
    public Window(int width, int height, String title) {
        super(title);
        setLayout(null);
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);
        setResizable(false);
        setVisible(true);
    }
    @Override
    public Component add(Component component) {
        component.setBounds(new Rectangle(new Point(0, 0), new Dimension(getWidth(), getHeight())));
        return super.add(component);
    }
}
