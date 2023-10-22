package utilidad;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;

public class JLabelDeluxe extends JLabel {
    private Color color;
    private Color colorOver;
    private boolean isDegradado;
    private int curva;

    public JLabelDeluxe(int curva, Color color) {
        super();
        this.curva = curva;
        this.color = color;
    }

    public JLabelDeluxe(int curva, Color color, Color colorOver) {
        this(curva, color);
        this.colorOver = colorOver;
        isDegradado = true;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);

        // Dibuja el fondo redondeado
        Rectangle bounds = g2d.getClipBounds();
        if (isDegradado) {
            GradientPaint gradient = new GradientPaint(0, 0, color, 0, getHeight(), colorOver);
            g2d.setPaint(gradient);
        } else {
            g2d.setColor(color);
        }
        g2d.fillRoundRect(0, 0, bounds.width, bounds.height, curva, curva);
        super.paintComponent(g);
    }
}
