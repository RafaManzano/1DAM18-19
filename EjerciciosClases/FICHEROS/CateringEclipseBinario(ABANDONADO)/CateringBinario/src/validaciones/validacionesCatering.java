package validaciones;

import clases.CamareroImp;
import clases.MesaImp;
import enumeraciones.EnumTurno;
import gestora.gestionGenerica;
import java.io.*;
import java.util.*;
public class validacionesCatering {
    /*
    Interfaz
    Nombre: leeryValidarOpcion
    Comentario: Este subprograma lee y valida la opcion del menu
    Cabecera: public int leeryValidarOpcion()
    Precondiciones: No hay
    Entrada: No hay
    Salida: int opcion //La opcion del menu ya validada
    E/S: No hay
    Postcondiciones: Asociado al nombre, la opcion queda validada
    */

    public int leeryValidarOpcion() {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.println("La opcion tiene que ser de 0 a 3");
            opcion = teclado.nextInt();
        }
        while(opcion < 0 || opcion > 3);

        return opcion;
    }

    /*
    Interfaz
    Nombre: leeryValidarRespuesta
    Comentario: Este subprograma lee y valida la respuesta
    Cabecera: public char leeryValidarRespuesta()
    Precondiciones: No hay
    Entrada: No hay
    Salida: char respuesta //La respuesta para guardar
    E/S: No hay
    Postcondiciones: Asociado al nombre, la respuesta queda validada
    */

    public char leeryValidarRespuesta() {
        char respuesta;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("La respuesta tiene que ser s o n");
            respuesta = Character.toUpperCase(teclado.next().charAt(0));
        }
        while(respuesta != 'S' && respuesta != 'N');

        return respuesta;
    }

    /*
    Interfaz
    Nombre: leeryValidarTurno
    Comentario: Este subprograma lee y valida el turno
    Cabecera: EnumTurno leeryValidarTurno()
    Precondiciones: No hay
    Entrada: No hay
    Salida: EnumTurno turno //El turno para su posterior muestra
    E/S: No hay
    Postcondiciones: Asociado al nombre, el turno queda validado para su uso
    */

    public EnumTurno leeryValidarTurno() {
        Scanner teclado = new Scanner(System.in);
        EnumTurno turno = EnumTurno.NODEFINIDO;
        char letra;
        System.out.println("Elija un turno (MANHANA (M), TARDE (T) o NOCHE (N))");
        letra = Character.toUpperCase(teclado.next().charAt(0));

        switch (letra) {
            case 'M':
                turno = EnumTurno.MANHANA;
            break;

            case 'T':
                turno = EnumTurno.TARDE;
            break;

            case 'N':
                turno = EnumTurno.NOCHE;
            break;
        }
        return turno;
    }

    /*
    Interfaz
    Nombre: leeryValidarCamarero
    Comentario: Este subprograma lee y valida un nuevo camarero
    Cabecera: public CamareroImp leeryValidarCamarero()
    Precondiciones: No hay
    Entrada: No hay
    Salida: CamareroImp camarero //El camarero creado y validado correctamente
    E/S: No hay
    Postcondiciones: Asociado al nombre. El camarero estaria validado y creado correctamente
    */

    public CamareroImp leeryValidarCamarero() {
    	int id;
        String nombre;
        String apellidos;
        MesaImp[] mesas;
        EnumTurno turno = EnumTurno.NODEFINIDO;
        Scanner teclado = new Scanner(System.in);
        CamareroImp camarero;
        id = leeryValidarID();
        System.out.println("Escriba su nombre");
        nombre = teclado.next();
        System.out.println("Escriba su apellido");
        apellidos = teclado.next();
        turno = leeryValidarTurno();
        mesas = leeryValidarMesas();

        return camarero = new CamareroImp(id, nombre, apellidos, turno, mesas);
    }

    

	/*
    Interfaz
    Nombre: leeryValidarMesas
    Comentario: Este subprograma lee y valida las mesas que servira el camarero
    Cabecera: public MesaImp[] leeryValidarMesas()
    Precondiciones: No hay
    Entrada: No hay
    Salida: - MesaImp[] mesas //Es el array de 4 mesas que servira el camarero
    E/S: No hay
    Postcondiciones: Asociado al nombre, Un array de 4 mesas que son las que servira el camarero
    */
    public MesaImp[] leeryValidarMesas() {
        MesaImp[] mesas = new MesaImp[4];
        Scanner teclado = new Scanner(System.in);
        int mesaBuscada = 0;
        gestionGenerica g = new gestionGenerica();

        for (int i = 0; i < mesas.length; i++) {
        g.mostrarFichero("mesas.dat");
        System.out.println("Elija uno");
        
        if(i == 0) {
        	mesaBuscada = teclado.nextInt();
        	mesas[i] = new MesaImp(mesaBuscada);
        }
        else {
        	do {
        		mesaBuscada = teclado.nextInt();
        		mesas[i] = new MesaImp(mesaBuscada);
        	}
        	while(mesas[i-1].getID() == mesaBuscada);
        }
        
        }
       
        return mesas;
    }

    /*
    Interfaz
    Nombre: leeryValidarMesa
    Comentario: Este subprograma lee y valida una mesa
    Cabecera: public MesaImp leeryValidarMesa()
    Precondiciones: No hay
    Entrada: No hay
    Salida: - MesaImp mesa //La mesa creada y validada correctamente
    E/S: No hay
    Postcondiciones: Asociado al nombre, la mesa esta creada y validada correctamente
    */
    public MesaImp leeryValidarMesa() {
        MesaImp mesa = new MesaImp();
        int id;
        String linea;
        boolean valido = false;
        Scanner teclado = new Scanner(System.in);
        try {
            BufferedReader br = new BufferedReader(new FileReader("mesas.dat"));
            do {
                System.out.println("Escriba el numero de mesa");
                id = teclado.nextInt();
            }
            while(id < 1 || id > 99);

            while((linea = br.readLine()) != null || valido == false) {
                if(!linea.equals((Integer)id)) {
                    valido = true;
                    mesa = new MesaImp(id);
                }
            }
        }
        catch (FileNotFoundException err) {
            err.printStackTrace();
        }
        catch (IOException err) {
            err.printStackTrace();
        }
        return mesa;
    }
    
    /*
     * Interfaz
     * Nombre: errores
     * Comentario: Este subprograma devuelve el comentario para el codigo de error
     * Cabecera: public void errores (int err)
     * Precondiciones: No hay
     * Entrada: - int err //El codigo de error necesario para mostrar
     * Salida: No hay
     * E/S: No hay
     * Postcondiciones: Solo muestra en pantalla el comentario necesario para el error especificado
     */
    public void errores (int err) {
    	switch(err) {
    	case 0:
    		System.out.println("Completado con exito");  
    	break;
    	
    	case 1:
    		System.out.println("Camarero no encontrado, no se elimina");  
    	break;
    	
    	case 2:
    		System.out.println("En el turno especificado no trabaja ningun camarero");  
    	break;
    	
    	case 3:
    		System.out.println("Todos los camareros estan eliminados, no se introduce en el fichero maestro");  
		break;
		
		default:
			System.out.println("Error no especificado");  
		break;
    	}
    }
    
    private int leeryValidarID() {
    	int id;
    	Scanner teclado = new Scanner(System.in);
    	 do {
             System.out.println("Escriba el id del camarero");
             id = teclado.nextInt();
         }
         while(id < 0);
    	 
		 return id;
	}
}
