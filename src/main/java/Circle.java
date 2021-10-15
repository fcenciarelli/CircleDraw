
import java.awt.*;

public class Circle {
    private int rad;
    private Point pos;
    private Color col;

    public Circle(Point initPos, Color col, int radius) {
        rad = radius;
        pos = initPos;
        this.col = col;
    }

    public void draw(Graphics g) {
        g.setColor(col);
        g.fillOval(pos.x, pos.y, rad, rad);
    }
}
