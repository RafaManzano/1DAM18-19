package clases;

/*
Interfaz
Propiedades basicas

ID
Tipo: int
Cons: Si
Mod: No

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
acumCamareros
Tipo: int
Cons: Si
Mod: No

Get and Set
ID
public int getID()

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
    private static int acumCamareros = 1;

    //Constructor
    public CamareroImp() { //Por defecto
        id = acumCamareros++;
        nombre = "NoDefinido";
        apellidos = "NoDefinido";
        turno = turno.NODEFINIDO;
        mesas = new MesaImp[4];
    }

    public CamareroImp(String nombre, String apellidos, EnumTurno turno, MesaImp[] mesas) { //Con parametros
        id = acumCamareros++;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.turno = turno;
        this.mesas = mesas;
    }

    public CamareroImp(CamareroImp cop) { //De copia
        id = acumCamareros++;
        this.nombre = cop.getNombre();
        this.apellidos = cop.getApellidos();
        this.turno = cop.getTurno();
        this.mesas = cop.getMesas();
    }

    //Get and Set
    //ID
    public int getID() {
        return id;
    }

    //Nombre
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Apellidos
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    //Turno
    public EnumTurno getTurno() {
        return turno;
    }

    public void setTurno(EnumTurno turno) {
        this.turno = turno;
    }

    //Mesas
    public MesaImp[] getMesas() {
        return mesas;
    }

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

    public String mostrarIDMesas() {
        String mesitas = "";
        for (int i = 0; i < mesas.length; i++) {
            mesitas += mesas[i].getID() + ",";
        }
        return mesitas;
    }
}
