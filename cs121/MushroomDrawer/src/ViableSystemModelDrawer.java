import java.awt.*;
import javax.swing.*;

public class ViableSystemModelDrawer extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Draw Operations subsystem
        g2d.setColor(new Color(220, 220, 220)); // Set color to light gray
        g2d.fillRect(50, 50, 100, 50); // Draw a rectangle for the subsystem
        g2d.setColor(new Color(0, 0, 0)); // Set color to black
        g2d.drawString("Operations", 65, 80); // Draw the subsystem label

        // Draw Coordination subsystem
        g2d.setColor(new Color(220, 220, 220)); // Set color to light gray
        int[] xPoints = {200, 250, 200, 150}; // X-coordinates of the diamond shape
        int[] yPoints = {50, 75, 100, 75}; // Y-coordinates of the diamond shape
        g2d.fillPolygon(xPoints, yPoints, 4); // Draw a diamond shape for the subsystem
        g2d.setColor(new Color(0, 0, 0)); // Set color to black
        g2d.drawString("Coordination", 170, 85); // Draw the subsystem label

        // Draw Control subsystem
        g2d.setColor(new Color(220, 220, 220)); // Set color to light gray
        g2d.fillRect(50, 150, 100, 50); // Draw a rectangle for the subsystem
        g2d.setColor(new Color(0, 0, 0)); // Set color to black
        g2d.drawString("Control", 75, 180); // Draw the subsystem label

        // Draw Intelligence subsystem
        g2d.setColor(new Color(220, 220, 220)); // Set color to light gray
        g2d.fillOval(175, 150, 50, 50); // Draw a circle for the subsystem
        g2d.setColor(new Color(0, 0, 0)); // Set color to black
        g2d.drawString("Intelligence", 178, 180); // Draw the subsystem label

        // Draw Policy subsystem
        g2d.setColor(new Color(220, 220, 220)); // Set color to light gray
        int[] xPoints2 = {300, 350, 325}; // X-coordinates of the triangle shape
        int[] yPoints2 = {150, 150, 200, 200}; // Y-coordinates of the triangle shape
        g2d.fillPolygon(xPoints2, yPoints2, 4); // Draw a triangle for the subsystem
        g2d.setColor(new Color(0, 0, 0)); // Set color to black
        g2d.drawString("Policy", 305, 180); // Draw the subsystem label
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Viable System Model");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 250);
        ViableSystemModelDrawer panel = new ViableSystemModelDrawer();
        frame.add(panel);
        frame.setVisible(true);
    }
}

