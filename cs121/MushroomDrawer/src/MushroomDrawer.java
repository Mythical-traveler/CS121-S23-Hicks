import java.awt.*;
import javax.swing.*;

public class MushroomDrawer extends JPanel {
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        // Draw mushroom cap
        g2d.setColor(new Color(219, 54, 44)); // Set color to red-brown
        g2d.fillOval(50, 50, 200, 150); // Draw an oval shape for the mushroom cap

        // Draw mushroom stem
        g2d.setColor(new Color(255, 255, 255)); // Set color to white
        g2d.fillRect(135, 200, 30, 100); // Draw a rectangle for the mushroom stem

        // Draw spots on mushroom cap
        g2d.setColor(new Color(255, 255, 255)); // Set color to white
        g2d.fillArc(60, 75, 70, 70, 0, 360); // Draw a white arc
        g2d.fillArc(150, 75, 70, 70, 0, 360); // Draw another white arc
        g2d.fillArc(105, 105, 70, 70, 0, 360); // Draw a third white arc
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Mushroom Drawer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new MushroomDrawer());
        frame.setSize(300, 350);
        frame.setVisible(true);
    }
}
