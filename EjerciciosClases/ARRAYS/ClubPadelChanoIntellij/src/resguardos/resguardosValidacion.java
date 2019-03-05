package resguardos;

import clases.PistaImp;
import clases.SocioImp;

import java.util.Scanner;

public class resguardosValidacion {

    /*
     * Interfaz
     * Nombre: validarOpciones3
     * Comentario: Este subprograma valida la opcion de los menus (menuPrincipal, menuSocio, menuPista)
     * Cabecera: public int validarOpciones3()
     * Precondiciones: No hay
     * Entrada: No hay
     * Salida: int validado //Es el numero que hay que validar
     * E/S: No hay
     * Postcondiciones: El numero quedaria validado
     */
    public int validarOpciones3() {
        System.out.println("En resguardo");
        return 1;
    }

    /*
     * Interfaz
     * Nombre: validarOpciones2
     * Comentario: Este subprograma valida la opcion de los menus (menuReservas)
     * Cabecera: public int validarOpciones2()
     * Precondiciones: No hay
     * Entrada: No hay
     * Salida: int validado //Es el numero que hay que validar
     * E/S: No hay
     * Postcondiciones: El numero quedaria validado
     */
    public int validarOpciones2() {
        System.out.println("En resguardo");
        return 1;
    }

    /*
     * Interfaz
     * Nombre: validarOpciones5
     * Comentario: Este subprograma valida la opcion de los menus (menuReservas)
     * Cabecera: public int validarOpciones5()
     * Precondiciones: No hay
     * Entrada: No hay
     * Salida: int validado //Es el numero que hay que validar
     * E/S: No hay
     * Postcondiciones: El numero quedaria validado
     */
    public int validarOpciones5() {
        System.out.println("En resguardo");
        return 1;
    }

	/*
	Interfaz
	Nombre: validarSocio
	Comentario: Este subprograma valida el socio para su posterior introduccion en el sistema
	Cabecera: public SocioImp validarSocio()
	Precondiciones: No hay
	Entrada: No hay
	Salida: SocioImp socio //El socio ya validado
	E/S: No hay
	Postcondiciones: Asociado al nombre, el socio ya validado
	//Try catch bonitos
	*/

    public SocioImp validarSocio() {
        SocioImp socio = new SocioImp();
        System.out.println("En resguardo");
        return socio;
    }

	/*
	Interfaz
	Nombre: validarCuota
	Comentario: Este subprograma valida la cuota del socio
	Cabecera: public int validarCuota()
	Precondiciones: No hay
	Entrada: No hay
	Salida: int cuota //La cuota queda validada
	E/S: No hay
	Postcondiciones: Asociado al nombre, la cuota queda validada
	*/

    public int validarCuota() {
        int cuota;
        Scanner teclado = new Scanner(System.in);
        do {
            System.out.println("La cuota tiene que ser mayor que 0");
            cuota = teclado.nextInt();
        }
        while(cuota <= 0);

        return cuota;
    }

	/*
	Interfaz
	Nombre: validarEdad
	Comentario: Este subprograma valida la edad del socio
	Cabecera: public int validarEdad()
	Precondiciones: No hay
	Entrada: No hay
	Salida: int cuota //La edad queda validada
	E/S: No hay
	Postcondiciones: Asociado al nombre, la edad queda validada
	*/

    public int validarEdad() {
        System.out.println("En resguardo");
        return 1;
    }

	/*
	Interfaz
	Nombre: validarGenero
	Comentario: Este subprograma valida el genero del socio
	Cabecera: public int validarGenero()
	Precondiciones: No hay
	Entrada: No hay
	Salida: int cuota //El genero queda validado
	E/S: No hay
	Postcondiciones: Asociado al nombre, el genero queda validado
	*/

    public char validarGenero() {
        System.out.println("En resguardo");
        return 'c';
    }

	/*
	Interfaz
	Nombre: validarPista
	Comentario: Este subprograma valida una pista para introducirla en el sistema
	Cabecera: public PistaImp validarPista()
	Precondiciones: El array de socios tiene que tener al menos un socio
	Entrada: SocioImp array //El array de socios para elegir uno
	Salida: PistaImp pista //La pista correcta
	E/S: No hay
	Postcondiciones: Asociado al nombre. La pista quedaria totalmente correcta
	*/

    public PistaImp validarPista(SocioImp[] array) {
        PistaImp pista = new PistaImp();
        System.out.println("En resguardo");
        return pista;
    }

	/*
	Interfaz
	Nombre: validarNumeroPista
	Comentario: Este subprograma valida una numero de pista
	Cabecera: public int validarNumeroPista()
	Precondiciones No hay
	Entrada: No hay
	Salida: int validado //El numero de pista quedaria validado
	E/S: No hay
	Postcondiciones: Asociado al nombre. El numero de pista quedaria validado
	*/

    public int validarNumeroPista() {
        System.out.println("En resguardo");
        return 1;
    }

	/*
	Interfaz
	Nombre: validarHora
	Comentario: Este subprograma valida una hora para la pista
	Cabecera: public int validarHora()
	Precondiciones No hay
	Entrada: No hay
	Salida: int validado //La hora quedaria validado
	E/S: No hay
	Postcondiciones: Asociado al nombre.La hora quedaria validado
	*/

    public int validarHora() {
        System.out.println("En resguardo");
        return 1;
    }

}


