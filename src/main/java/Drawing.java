import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import java.awt.*;

public class Drawing extends Canvas {

    Point p = new Point(200, 200);
    Color c = new Color(0x992266);
    Circle cir = new Circle(p,  c, 30 );
    private Frame f;

    public Drawing() {
        f = new Frame("My window");
        f.add(this);
        f.setLayout(null);
        f.setSize(400,400);
        f.setVisible(true);
        f.addWindowListener(new WindowAdapter() {
            public void WindowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        setBackground(Color.WHITE);
        setSize(400, 400);
    }

    public void paint(Graphics g) {
        cir.draw(g);
    }
}
