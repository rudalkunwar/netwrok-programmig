import javax.swing.*;
import java.awt.*;

public class Q3 extends JPanel {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Set rendering hints for better quality
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Define the points for the triangle
        int[] xPoints = {50, 100, 150};
        int[] yPoints = {50, 150, 50};
        int numPoints = xPoints.length;

        // Draw an outlined triangle with black color
        g2d.setColor(Color.BLACK); // Border color
        g2d.drawPolygon(xPoints, yPoints, numPoints);

        // Draw an outlined square with BLACK color
        g2d.setColor(Color.BLACK); // Border color
        g2d.drawRect(200, 200, 100, 100);

        // Draw a filled square with black color
        g2d.setColor(Color.BLACK); // Fill color
        g2d.fillRect(200, 50, 100, 100);


        // Draw a filled triangle with BLACK color
        g2d.setColor(Color.BLACK); // Fill color
        g2d.fillPolygon(new int[]{300, 350, 400}, new int[]{50, 150, 50}, 3);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("2D Shapes Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);

        Q3 panel = new Q3();
        frame.add(panel);

        frame.setVisible(true);
    }
}