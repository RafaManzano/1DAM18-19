package Main;

import gestora.gestora;

public class Main {

    public static void main(String[] args) {
        gestora ges = new gestora();
        String ruta = "salida.txt";
        //Leera la linea hasta que llegue al salto de linea
        //Lo unico que se tendria que saber cuanto vale cada String para saber cuanto debes avanzar para colocarte en la siguiente linea
        //El retorno de carro pesa 2 bytes
        System.out.println(ges.leerFichero(ruta, 20));
        //ges.escribirFichero(ruta, "Rafalito", 22);
        ges.marcado(ruta, 45);
    }

}







