package utilidad;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

public class JPanelDeluxe extends JPanel {
    private ImageIcon imageIcon;
    private Image scaledImage;

    public JPanelDeluxe(String cad, int width, int height) {
        String dir = System.getProperty("user.dir").replace("\\", "\\\\") + "\\imagen\\";
        imageIcon = new ImageIcon(dir + cad);
        scaledImage = imageIcon.getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (scaledImage != null) {
            g.drawImage(scaledImage, 0, 0, this);
        }
    }
}
