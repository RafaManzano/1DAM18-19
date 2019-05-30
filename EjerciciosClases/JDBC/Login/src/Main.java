/*
Nombre del programa: Main
Breve comentario: Con este programa simularemos la introduccion con un login de un usuario registrado en la base de datos

Analisis
 - Entrada: - String usuario
            - String contrasenha
 - Salida: - Verificacion de si ha entrado en el login o no (por interfaz grafica)
 - Requisitos: Ninguno

 PG Level 0
 Inicio
    PedirUsuario
    PedirContrasenha
    Si el usuario es correcto
        MensajeCorrecto
    Sino
        MensajeError
    FinSi
 Fin
 */


import funcionesJFrame.loginVentana;

public class Main {

    public static void main(String[] args) {
        loginVentana l = new loginVentana();
        l.setVisible(true);


    }
}
