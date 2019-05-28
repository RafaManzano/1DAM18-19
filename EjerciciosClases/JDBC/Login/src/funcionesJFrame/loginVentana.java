package funcionesJFrame;

import javax.swing.*;


public class loginVentana extends JFrame {

    public loginVentana () {
            super();
            configurarVentana();
            inicializarComponentes();
    }

    public void configurarVentana() {
        this.setTitle("Login");
        this.setSize(310, 210);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void inicializarComponentes() {

    JLabel usu = new JLabel();
    JTextField usuario = new JTextField();
    JLabel cont = new JLabel();
    JPasswordField pass = new JPasswordField();
    JButton boton = new JButton();

    usu.setText("Usuario: ");
    usu.setBounds(50, 20, 100, 25);
    usuario.setBounds(150, 20, 100, 25);
    cont.setText("Contraseña: ");
    cont.setBounds(50, 50, 100, 25);
    pass.setBounds(150, 50, 100, 25);
    boton.setText("ENVIAR");
    boton.setBounds(50, 100, 200, 30);

    this.add(usu);
    this.add(usuario);
    this.add(cont);
    this.add(pass);
    this.add(boton);
    }

    }
