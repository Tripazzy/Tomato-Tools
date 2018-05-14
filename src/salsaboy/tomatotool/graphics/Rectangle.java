package salsaboy.tomatotool.graphics;

import java.awt.*;

public class Rectangle extends Component {
    private int x, y, width, height;
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    @Override
    public void paint(Graphics g) {
        g.drawRect(x, y, width, height);
    }
}
