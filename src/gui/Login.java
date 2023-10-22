package gui;

import java.awt.Color;
import javax.swing.*;
import utilidad.*;

public class Login {
    private JFrame ventana;
    private JPanelDeluxe fondo;
    private final int WIDTH=1000;
    private final int HEIGHT=600;
    private JLabel t1,t2;
    private JLabelDeluxe userLabel, passwordLabel;
    private JTextField user, password;
    private JButtonDeluxe loginBtn;
    private Formato f = new Formato();

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
        initTitulo();
        initUserField();
        initUserLabel();
        initPasswordLabel();
        initPasswordField();
        initLoginBtn();
    }

    private void initTitulo(){
        t1 = new JLabel("BIENVENIDO");
        t2 = new JLabel("ADMINISTRADOR");
        t1.setBounds(501, 80, 400, 32);
        t2.setBounds(501, 130, 400, 32);
        t1.setForeground(Color.WHITE);
        t2.setForeground(Color.WHITE);
        f.format(t1, 0, 40);
        f.format(t2, 0, 40);
        t1.setHorizontalAlignment(SwingConstants.CENTER);
        t2.setHorizontalAlignment(SwingConstants.CENTER);
        fondo.add(t1);
        fondo.add(t2);

    }

    private void initUserLabel(){
        userLabel = new JLabelDeluxe(30, Color.WHITE);
        userLabel.setBounds(501, 240, 400, 50);
        fondo.add(userLabel);
    }

    private void initUserField(){
        user = new JTextField();
        user.setBounds(511,245,380, 40);
        user.setBorder(null);
        f.format(user, 0, 20);
        fondo.add(user);
    }

    private void initPasswordLabel(){
        passwordLabel = new JLabelDeluxe(30, Color.WHITE);
        passwordLabel.setBounds(501, 340, 400, 50);
        fondo.add(passwordLabel);
    }

    private void initPasswordField(){
        password = new JTextField();
        password.setBounds(511,345,380, 40);
        password.setBorder(null);
        f.format(password, 0, 20);
        fondo.add(password);
    }

    private void initLoginBtn(){
        loginBtn = new JButtonDeluxe(40, new Color(109, 40, 43));
        loginBtn.setBounds(501, 440, 400, 50);
        loginBtn.setText("INGRESAR");
        f.format(loginBtn, 0, 20);
        loginBtn.setForeground(Color.WHITE);
        fondo.add(loginBtn);
    }

    public static void main(String[] args) {
        Login c = new Login();
    }

}