package salsaboy.tomatotool.graphics;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    @Override
    public void paint(Graphics g) {
        for (int i = 0; i < getComponentCount(); i++) {
            getComponent(i).paint(g);
        }
    }
    
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
}
