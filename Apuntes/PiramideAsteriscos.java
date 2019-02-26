import java.util.Scanner;
 
public class PiramideAsteriscos {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca numero de filas: ");
        int numFilas = sc.nextInt();
        sc.close();
         
        System.out.println();
        for(int altura = 1; altura<=numFilas; altura++){
            //Espacios en blanco
            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                System.out.print(" ");
            }
             
            //Asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
         
        System.out.println("\nSegunda forma\n");
         
        for(int numBlancos = numFilas-1,numAsteriscos=1; numBlancos>=0; numBlancos--, numAsteriscos += 2){
            //Espacios en blanco
            for(int i=1;i<=numBlancos;i++){
                System.out.print(" ");
            }
             
            //Asteriscos
            for(int j=1;j<=numAsteriscos;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
