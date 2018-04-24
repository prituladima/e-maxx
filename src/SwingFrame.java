import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class SwingFrame extends JFrame {

    public SwingFrame() {
        setTitle("Computer science");
        setSize(1024, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);  // fixes the immediate problem.
        Graphics2D g2 = (Graphics2D) g;
        drawRect(g2, 100, 100, 250, 260, 1);
        System.out.println(count);
    }

    Random rand = new Random();
    int count = 0;

    private void drawRect(Graphics2D g2, float x, float y, float w, float h, int deep) {
        if (deep == 7) {count++; return;}


        Rectangle2D lin = new Rectangle2D.Float(x, y, w, h);

        float r = rand.nextFloat();
        float g = rand.nextFloat();
        float b = rand.nextFloat();
        g2.setColor(new Color(r, g, b));
        sleep();
        g2.draw(lin);
        deep += 1;
        drawRect(g2, x, y, w / 2, h / 2, deep);
        drawRect(g2, x, y + h / 2, w / 2, h / 2, deep);
        drawRect(g2, x + w / 2, y, w / 2, h / 2, deep);
        drawRect(g2, x + w / 2, y + h / 2, w / 2, h / 2, deep);
    }


    private void sleep() {
        try {
            TimeUnit.MILLISECONDS.sleep(10);
        } catch (InterruptedException e) {

        }
    }

    public static void main(String[] args) {
        SwingFrame ex = new SwingFrame();
        ex.setVisible(true);
    }
}
