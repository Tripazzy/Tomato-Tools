package salsaboy.tomatotool.graphics;

import java.awt.*;

public class Line extends Component {
    private int startx, starty;
    private int endx, endy;
    public Line(int x1, int y1, int x2, int y2) {
        startx = x1;
        starty = y1;
        endx = x2;
        endy = y2;
        
        repaint();
    }
    
    @Override
    public void paint(Graphics g) {
        g.drawLine(startx, starty, endx, endy);
        System.out.println("Printing");
    }
}
