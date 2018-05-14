package salsaboy.tomatotool.graphics;

import javax.swing.*;
import java.awt.*;

/**
 * Put a class that extends this in the package where your
 * images are.
 */
public class Image extends JLabel {
    public Image(String filename) {
        this(filename, 0, 0);
    }
    public Image(String filename, int x, int y) {
        super(new ImageIcon(Image.class.getResource(filename + ".png")));
        setBounds(new Rectangle(new Point(x, y), getPreferredSize()));
    }
}
