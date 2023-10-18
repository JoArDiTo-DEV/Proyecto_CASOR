package utilidad;

import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.RoundRectangle2D;

public class JTextfieldDeluxe extends JTextField {
    private int cornerRadius;
    private Color backgroundColor;

    public JTextfieldDeluxe(int curva, Color color) {
        this.cornerRadius = curva;
        this.backgroundColor = color;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(backgroundColor);
        g2.fill(new RoundRectangle2D.Double(0, 0, getWidth(), getHeight(), cornerRadius, cornerRadius));
        super.paintComponent(g);
    }
}

