package gestora;

import clases.CamareroImp;

import java.io.*;

public class gestionCamareros {
    /*
    Interfaz
    Nombre: introducirCamarero
    Comentario: Este subprograma añade un nuevo camarero al fichero
    Cabecera: public void introducirCamarero(String ruta, CamareroImp camarero)
    Precondiciones: No hay
    Entrada: - String ruta //Es la ruta donde esta el fichero
             - CamareroImp camarero //Es el trabajador ha introducir en el fichero
    Salida: No hay
    E/S: No hay
    Postcondiciones: El camarero quedaria introducido en el fichero
    */
    public void introducirCamarero(String ruta, CamareroImp camarero) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(ruta, true));
            bw.write(camarero.toString());
            bw.newLine();
            bw.flush();
            bw.close();
        }
        catch(IOException err) {
            err.printStackTrace();
        }
    }

    /*
    Interfaz
    Nombre: buscaryEliminarCamarero
    Comentario: Busca en el fichero el camarero pasado por parametro y lo elimina (por marca)
    Cabecera: public void buscaryEliminarCamarero(String ruta, CamareroImp camarero)
    Precondiciones: El fichero debe estar creado
    Entrada: - String ruta //Es la ruta donde esta el fichero
             - CamareroImp camarero //Es el trabajador ha buscar en el fichero
    Salida: No hay
    E/S: No hay
    Postcondiciones: Mensaje de confirmacion
    */

    public void buscaryEliminarCamarero(String ruta, CamareroImp camarero) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(ruta));
            //RandomAccessFile rrw = new RandomAccessFile(ruta, "rw")
            br.mark(0);
            br.reset();
            String linea;

            while((linea = br.readLine()) != null) {
            //for(int contador = 0; (linea = br.readLine()) != null; contador++) {
                if(linea.equals(camarero.toString())) {
                    //Coger la marca
                    //System.out.println("Esta eliminado Hulio");
                    eliminarRegistro(ruta);
                }
            }
            br.close();
        }
        catch (IOException err) {
            err.printStackTrace();
        }
    }

    /*
    Interfaz
    Nombre: eliminarRegistro
    Comentario: Este subprograma marca el registro para su posterior eliminacion
    Cabecera: public void eliminarRegistro(String ruta)
    Precondiciones: El fichero debe estar creado
    Entrada: - String ruta //La ruta del fichero debe ser correcta
    Salida: No hay
    E/S: No hay
    Postcondiciones: Marca en el fichero con "ELIMINADO" el registro ha eliminar
    */

    public void eliminarRegistro(String ruta) {
        try {
            RandomAccessFile rrw = new RandomAccessFile(ruta, "rw");
            //System.out.println(linea);

            rrw.writeUTF("ELIMINADO");
            rrw.close();
        }
        catch(FileNotFoundException err) {
            err.printStackTrace();
        }
        catch(IOException err) {
            err.printStackTrace();
        }
    }

    /*
    Interfaz
    Nombre: EliminarRegistro
    Comentario: Elimina el camarero pasado por parametro
    Cabecera:  public void EliminarRegistro(String ficheroAntiguo,String antiguaLinea)
    Precondiciones: No hay
    Entrada: - String ficheroAntiguo //Es la ruta donde esta el fichero
             - String antiguaLinea //Es la linea que se desea eliminar
    Salida: No hay
    E/S: No hay
    Postcondiciones: Mensaje de confirmacion
    */

    /*public void EliminarRegistro(String ficheroAntiguo,String antiguaLinea){
       File FAntiguo = new File(ficheroAntiguo);
       String ficheroNuevo = "camarerosN.txt";
       *//*Crea un objeto File para el fichero nuevo*//*
       File FficheroNuevo=new File(ficheroNuevo);

        try {
            *//*Si existe el fichero inical*//*
            if(FAntiguo.exists()){
                *//*Abro un flujo de lectura*//*
                BufferedReader Flee= new BufferedReader(new FileReader(FAntiguo));
                String Slinea;
                *//*Recorro el fichero de texto linea a linea*//*
                while((Slinea=Flee.readLine())!=null) {
                    *//*Si la linea obtenida es distinta al la bucada
                     *para eliminarr*//*
                    if (!Slinea.toUpperCase().trim().equals(antiguaLinea.toUpperCase().trim())) {
                        *//*la escribo en el fichero nuevo*//*
                        EscribirFichero(ficheroNuevo,Slinea);
                    }
                }
                *//*Obtengo el nombre del fichero inicial*//*
                String SnomAntiguo=FAntiguo.getName();
                *//*Borro el fichero inicial*//*
                BorrarFichero(ficheroAntiguo);
                *//*renombro el nuevo fichero con el nombre del fichero inicial*//*
                FficheroNuevo.renameTo(FAntiguo);
                *//*Cierro el flujo de lectura*//*
                Flee.close();
            }
            else{
                System.out.println("Fichero No Existe");
            }
        }
        catch (Exception err) {
            //Captura un posible error y le imprime en pantalla
            err.printStackTrace();
        }
    }

    *//*
    Interfaz
    Nombre: BorrarFichero
    Comentario: Este subprograma borra completamente el fichero
    Cabecera: public void BorrarFichero(String fichero)
    Precondiciones: No hay
    Entrada: String fichero //Es el fichero que se desea eliminar
    Salida: No hay
    E/S: No hay
    Postcondiciones: Muestra un mensaje con el resultado de la operacion
    *//*

    public void BorrarFichero(String fichero){
        File Ffichero = new File(fichero);
        try {
            *//*Si existe el fichero*//*
            if(Ffichero.exists()){
                *//*Borra el fichero*//*
                Ffichero.delete();
                System.out.println("Fichero Borrado con Exito");
            }
        }
        catch (Exception err) {
            //Captura un posible error y le imprime en pantalla
            err.printStackTrace();
        }
    }

    *//*
    Interfaz
    Nombre: EscribirFichero
    Comentario: Este subprograma escribe en el fichero. Lo uso para el fichero auxiliar
    Cabecera: public void EscribirFichero(String fichero, String SCadena)
    Precondiciones: No hay
    Entrada: - String fichero //Es el fichero a escribir
             - String SCadena //Es la cadena que hay que escribir en el fichero
    Salida: No hay
    E/S: No hay
    Postcondiciones: Un mensaje con el resultado de la operacion
    *//*
    public void EscribirFichero(String fichero,String SCadena){
        File Ffichero = new File(fichero);
        try {
            //Si no Existe el fichero lo crea
            if(!Ffichero.exists()){
                Ffichero.createNewFile();
            }
            //Abre un Flujo de escritura,sobre el fichero con codificacion utf-8. Ademas   en
            //el pedazo de sentencia "FileOutputStream(Ffichero,true)", true es por si existe el fichero
            //segir añadiendo texto y no borrar lo que tenia
            BufferedWriter Fescribe=new BufferedWriter(new OutputStreamWriter(new FileOutputStream(Ffichero,true), "utf-8"));
            //Escribe en el fichero la cardena que recibe la funcion. la cadena "\r\n" significa salto de linea
            Fescribe.write(SCadena + "\r\n");
            //Cierra el flujo de escritura
            Fescribe.close();
        }
        catch (Exception err) {
            //Captura un posible error y le imprime en pantalla
            err.printStackTrace();
        }
    }*/

}
