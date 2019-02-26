package ahorcadonormal;
 
import java.util.Scanner;
 
/**
 * @author Luis Created on 28/08/2014, 11:18:58 PM
 */
public class AhorcadoNormal {
 
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int vidas = 6;
        String palabra;
        int aciertos = 0;
        int tamanio;
        String opcion;
        int contador = 0;
        String[] palabras = new String[]{"lapiz", "goma", "libreta", "maestro", "examen", "matematicas"};
        char[] respuesta;
        palabra = palabras[(int) (Math.random() * 5)];
        tamanio = palabra.length();
        respuesta = new char[tamanio];
         
         
        for (int i = 0; i &lt; tamanio; i++) {
            respuesta[i] = 'X';
        }
         
 
        while (aciertos != tamanio &amp;&amp; vidas != 0) {
            System.out.println("=========AHORCADO :)==========          VIDAS="+vidas +" Aciertos= "+aciertos);
            //dibujar(vidas);
            System.out.println("");
            for (int i = 0; i &lt; tamanio; i++) {
 
                System.out.print("__" + respuesta[i] + "___  ");
            }
            System.out.println("\nIngresa una letra: ");
            opcion = s.next();
            if (palabra.contains(opcion)) {
                for (int i = 0; i &lt; tamaño; i++) {
                    if (palabra.charAt(i) == opcion.charAt(0)) {
                        respuesta[i] = opcion.charAt(0);
                        contador++;
                    }
                }
 
                aciertos = aciertos + contador;
            } else {
                vidas--;
            }
 
            contador = 0;
        }
        if(vidas==0){
            dibujar(vidas);
        }else
        {
            System.out.println("");
            for (int i = 0; i &lt; tamaño; i++) {
 
                System.out.print("__" + respuesta[i] + "___  ");
            }
            System.out.println("YOU WIN :)");
             
        }
    }
 
 /*
    private static void dibujar(int i) {
        switch (i) {
            case 6:
                System.out.println(" ---------------------");
                for (int j = 0; j &lt; 15; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 5:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                for (int j = 0; j &lt; 10; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 4:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                System.out.println(" |                     |   ");
                for (int j = 0; j &lt; 5; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 3:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / |   ");
                System.out.println(" |                 /   |   ");
                System.out.println(" |                /    |   ");
                System.out.println(" |                     |   ");
                for (int j = 0; j &lt; 5; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 2:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                for (int j = 0; j &lt; 5; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 1:
                System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | -  -  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    /  ");
                System.out.println(" |                   /      ");
                System.out.println(" |                  /       ");
                for (int j = 0; j &lt; 2; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                break;
 
            case 0:
               System.out.println(" ---------------------");
                System.out.println(" |                     |");
                System.out.println(" |                     |");
                System.out.println(" |                  -------");
                System.out.println(" |                 | X  X  |");
                System.out.println(" |                 |   o   |");
                System.out.println(" |                  -------");
                System.out.println(" |                     |   ");
                System.out.println(" |                   / | \\ ");
                System.out.println(" |                  /  |   \\ ");
                System.out.println(" |                 /   |     \\ ");
                System.out.println(" |                     |   ");
                System.out.println(" |                    / \\");
                System.out.println(" |                   /   \\  ");
                System.out.println(" |                  /     \\ ");
                for (int j = 0; j &lt; 2; j++) {
                    System.out.println(" |");
 
                }
                System.out.println("__________");
                System.out.println("GAME OVER");
                break;
        }
        */
    }

