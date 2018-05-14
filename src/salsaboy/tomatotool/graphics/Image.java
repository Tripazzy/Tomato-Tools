package salsaboy.tomatotool.graphics;

import javax.swing.*;
import java.awt.*;

/**
 * Put a class that extends this in the package where your
 * images are.
 */
public class Image extends JLabel {
    /**
     * Create an image and put it at 0, 0.
     * @see Image#Image(String, int, int)
     * @param filename The file to find (don't include the extension)
     */
    public Image(String filename) {
        this(filename, 0, 0);
    }
    
    /**
     * Create an image and put it at the specified location.
     * @param filename The file to find (don't include the extension)
     * @param x The x location to put the image
     * @param y The y location to put the image
     */
    public Image(String filename, int x, int y) {
        super(new ImageIcon(Image.class.getResource(filename + ".png")));
        setBounds(new Rectangle(new Point(x, y), getPreferredSize()));
    }
    
    /**
     * Moves the image.
     * @param x The x position to move it to
     * @param y The y position to move it to
     */
    public void moveTo(int x, int y) {
        setLocation(x, y);
    }
    
    /**
     * Move the image the specified direction the specified units (in pixels)
     * @param direction The direction to move in.
     * @param speed How far to move.
     */
    public void move(Direction direction, int speed) {
        final int x = getX(), y = getY();
        switch (direction) {
            case UP:
                moveTo(x, y - speed);
                break;
            case DOWN:
                moveTo(x, y + speed);
                break;
            case LEFT:
                moveTo(x - speed, y);
                break;
            case RIGHT:
                moveTo(x + speed, y);
                break;
                
            case TOPRIGHT:
                moveTo(x + speed, y - speed);
                break;
            case TOPLEFT:
                moveTo(x - speed, y - speed);
                break;
            case BOTTOMLEFT:
                moveTo(x - speed, y + speed);
                break;
            case BOTTOMRIGHT:
                moveTo(x + speed, y + speed);
                break;
        }
        
        repaint(); //TODO Check if this is necessary
    }
}
