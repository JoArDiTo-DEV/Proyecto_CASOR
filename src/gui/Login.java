package gui;

import java.awt.Color;

import javax.swing.*;
import utilidad.JPanelDeluxe;
import utilidad.JTextfieldDeluxe;

public class Login {
    private JFrame ventana;
    private JPanelDeluxe fondo;
    private final int WIDTH=1000;
    private final int HEIGHT=600;
    //private JTextfieldDeluxe user, password;

    public Login(){
        ventana = new JFrame();
        fondo = new JPanelDeluxe("login.png", WIDTH, HEIGHT);
        configVentana();
        ventana.getContentPane().revalidate();
        ventana.getContentPane().repaint();
    }

    private void configVentana(){
        ventana.setSize(WIDTH, HEIGHT);
		ventana.setLocationRelativeTo(null);
		ventana.setTitle("CASOR ADUANEROS: REGISTRO DE EMPLEADOS");
		fondo.setLayout(null);
		ventana.setResizable(false);
		ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana.setVisible(true);
		ventana.getContentPane().add(fondo);
        configComponents();
    }

    private void configComponents(){
        initUserField();
        
    }

    private void initUserField(){
        //user = new JTextfieldDeluxe(80, Color.WHITE);
        //user.setBounds(100,100,180, 60);
        //fondo.add(user);
    }

    public static void main(String[] args) {
        Login c = new Login();
    }

}