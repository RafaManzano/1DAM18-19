package clases;

/*
Interfaz
Propiedades basicas

ID
Tipo: int
Cons: Si
Mod: Si

Nombre
Tipo: String
Cons: Si
Mod: Si

Apellidos
Tipo: String
Cons: Si
Mod: Si

Turno
Tipo: EnumTurno
Cons: Si
Mod: Si

Mesas
Tipo: MesaImp[]
Cons: Si
Mod: Si

Propiedades derivadas
No hay

Propiedades compartidas
No hay

Get and Set
ID
public int getID()
public void setID(int id)

Nombre
public String getNombre()
public void setNombre(String nombre)

Apellidos
public String getApellidos()
public void setApellidos(String apellidos)

Turno
public EnumTurno getTurno ()
public void setTurno(EnumTurno turno)

Mesas
public MesaImp[] getMesas()
public void setMesas(MesaImp[] mesas)

Metodos anhadidos
public String mostrarIDMesas()
*/

import enumeraciones.EnumTurno;
import interfaces.Camarero;

public class CamareroImp implements Camarero, Cloneable, Comparable<CamareroImp> {
    //Atributos
    private int id;
    private String nombre;
    private String apellidos;
    private EnumTurno turno;
    private MesaImp[] mesas;

    //Constructor
    /**
     * Constructor por defecto
     */
    public CamareroImp() { //Por defecto
        id = 0;
        nombre = "NoDefinido";
        apellidos = "NoDefinido";
        turno = turno.NODEFINIDO;
        mesas = new MesaImp[4];
    }

    /**
     * Constructor con parametros
     * @param id
     * @param nombre
     * @param apellidos
     * @param turno
     * @param mesas
     */
    public CamareroImp(int id, String nombre, String apellidos, EnumTurno turno, MesaImp[] mesas) { //Con parametros
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.turno = turno;
        this.mesas = mesas;
    }

    /**
     * Constructor de copia
     * @param cop
     */
    public CamareroImp(CamareroImp cop) { //De copia
        this.id = cop.getID();
        this.nombre = cop.getNombre();
        this.apellidos = cop.getApellidos();
        this.turno = cop.getTurno();
        this.mesas = cop.getMesas();
    }

    //Get and Set
    //ID
    /**
     * Get del atributo id
     * @return id 
     */
    public int getID() {
        return id;
    }
    
    /**
     * Set del atributo id
     * @param id
     */
    public void setID(int id) {
    	this.id = id;
    }

    //Nombre
    /**
     * Get del atributo nombre
     * @return nombre 
     */
    public String getNombre() {
        return nombre;
    }
    
    /**
     * Set del atributo nombre
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Apellidos
    /**
     * Get del atributo apellidos
     * @return apellidos 
     */
    public String getApellidos() {
        return apellidos;
    }
    
    /**
     * Set del atributo apellidos
     * @param apellidos
     */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    //Turno
    /**
     * Get del atributo turno
     * @return turno 
     */
    public EnumTurno getTurno() {
        return turno;
    }

    /**
     * Set del atributo turno
     * @param turno
     */
    public void setTurno(EnumTurno turno) {
        this.turno = turno;
    }

    //Mesas
    /**
     * Get del atributo mesas
     * @return mesas
     */
    public MesaImp[] getMesas() {
        return mesas;
    }

    /**
     * Set del atributo mesas
     * @param mesas
     */
    public void setMesas(MesaImp[] mesas) {
        this.mesas = mesas;
    }

    //Metodos de la clase object
    //toString
    @Override
    public String toString() {
        return id + "," + nombre + "," + apellidos + "," + turno.toString() + "," + mostrarIDMesas();
    }

    //hashCode
    @Override
    public int hashCode() {
        return id * 7 + nombre.hashCode() + apellidos.hashCode() * 21;
    }

    //equals
    @Override
    public boolean equals(Object obj) {
        boolean res = false;

        if(this == obj) {
            res = true;
        }
        else if(obj != null && obj instanceof CamareroImp) {
            CamareroImp otro = (CamareroImp) obj;

            if(id == otro.getID()) {
                res = true;
            }
        }
        return res;
    }

    //clone
    @Override
    public CamareroImp clone() {
        CamareroImp copia = null;

        try {
            copia = (CamareroImp) super.clone();
        }
        catch(CloneNotSupportedException err) {
            System.out.println("Objeto no clonado");
        }

        return copia;
    }

    //compareTo
    public int compareTo(CamareroImp otro) {
        int comparar = -1;

        if(this.id == otro.getID()) {
            comparar = 0;
        }
        else if(this.id > otro.getID()) {
            comparar = 1;
        }

        return comparar;
    }

    /*
    Interfaz
    Nombre: mostrarIDMesas
    Comentario: Este subprograma muestra los ID de las mesas
    Cabecera: public String mostrarIDMesas
    Precondiciones: No hay
    Entrada: No hay
    Salida: String mesitas //El ID de las mesas que tiene asociadas cada camarero
    E/S: No hay
    Postcondiciones: Asociado al nombre, devuelve el id de las mesas asociados al camarero
    */

    /**
     * Este subprograma muestra los ID de las mesas
     * @return mesitas El ID de las mesas que tiene asociadas cada camarero
     */
    public String mostrarIDMesas() {
        String mesitas = "";
        for (int i = 0; i < mesas.length; i++) {
            mesitas += mesas[i].getID() + ",";
        }
        return mesitas;
    }
}
