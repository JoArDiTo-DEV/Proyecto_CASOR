package utilidad;

import javax.swing.JButton;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JButtonDeluxe extends JButton {
    private Color color;
    private Color colorOver;
    private boolean isDegradado;
    private int curva;

    public JButtonDeluxe(int curva, Color color) {
        super();
        this.curva = curva;
        this.color = color;
        setFocusable(false);
        setBorderPainted(false);
        setContentAreaFilled(false);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
                setColor(new Color((int) (color.getRed() * 0.70), (int) (color.getGreen() * 0.80),
                        (int) (color.getBlue() * 0.80)))    ;
                repaint();
            }

            @Override
            public void mouseExited(MouseEvent me) {
                setColor(color);
                repaint();
            }

            @Override
            public void mousePressed(MouseEvent me) {
                setColor(new Color((int) (color.getRed() * 0.90), (int) (color.getGreen() * 0.90),
                        (int) (color.getBlue() * 0.90)));
                repaint();
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                setColor(new Color((int) (color.getRed() * 0.80), (int) (color.getGreen() * 0.85),
                        (int) (color.getBlue() * 0.85)));
                repaint();
            }
        });
    }

    public JButtonDeluxe(int curva, Color color, Color colorOver) {
        this(curva, color);
        this.colorOver = colorOver;
        isDegradado = true;
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent me) {
            	setColor(new Color((int)(color.getRed()*0.70), (int)(color.getGreen()*0.80), (int)(color.getBlue()*0.80)));
                setColorOver(new Color((int)(colorOver.getRed()*0.70), (int)(colorOver.getGreen()*0.80), (int)(colorOver.getBlue()*0.80)));
            }

            @Override
            public void mouseExited(MouseEvent me) {
            	setColor(color);
                setColorOver(colorOver);
            }

            @Override
            public void mousePressed(MouseEvent me) {
            	setColor(new Color((int)(color.getRed()*0.90), (int)(color.getGreen()*0.90), (int)(color.getBlue()*0.90)));
                setColorOver(new Color((int)(colorOver.getRed()*0.90), (int)(colorOver.getGreen()*0.90), (int)(colorOver.getBlue()*0.90)));
            }

            @Override
            public void mouseReleased(MouseEvent me) {
                setColor(new Color((int)(color.getRed()*0.80), (int)(color.getGreen()*0.85), (int)(color.getBlue()*0.85)));
                setColorOver(new Color((int)(colorOver.getRed()*0.80), (int)(colorOver.getGreen()*0.85), (int)(colorOver.getBlue()*0.85)));    
            }
        });
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColorOver(){
        return colorOver;
    }

    public void setColorOver(Color colorOver){
        this.colorOver = colorOver;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (isDegradado) {
            Graphics2D g2d = (Graphics2D) g;
            GradientPaint gradient = new GradientPaint(0, 0, color, 0, getHeight(), colorOver);
            g2d.setPaint(gradient);
            g2d.fillRoundRect(0, 0, getWidth(), getHeight(), curva, curva);
        } else {
            Graphics2D g2d = (Graphics2D) g;
            g2d.setColor(color);
            g2d.fillRoundRect(0, 0, getWidth(), getHeight(), curva, curva);
        }
    }
}
