package utilidad;

import javax.swing.*;

public class Formato {
    Fuente fuente;

	public Formato() {
		fuente = new Fuente();
	}

    public void format(JLabel l, int estilo, float tamanio){
        l.setFont(fuente.MyFont(estilo, tamanio));
		l.setOpaque(false);
		l.setBorder(BorderFactory.createEmptyBorder());
    }

    public void format(JTextField l, int estilo, float tamanio){
        l.setFont(fuente.MyFont(estilo, tamanio));
		l.setEditable(true);
		l.setFocusable(true);
		l.setOpaque(true);
		l.setBorder(BorderFactory.createEmptyBorder());
    }

    public void format(JButtonDeluxe l, int estilo, float tamanio){
        l.setFont(fuente.MyFont(estilo, tamanio));
		l.setOpaque(false);
		l.setBorder(BorderFactory.createEmptyBorder());
    }


}
