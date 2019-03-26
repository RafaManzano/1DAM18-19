package clases;

import interfaces.Trabajador;

/*
Propiedades Basicas
IDTrabajador
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

Edad
Tipo: int
Cons: Si
Mod: Si

Sexo
Tipo: char
Cons: Si
Mod: No

Propiedades Derivadas
No hay

Propiedades compartidas
AcumTrabajador
Tipo: int
Cons: Si
Mod: No

Get and Set
IDTrabajador
public int getID()

Nombre
public String getNombre()
public void setNombre(String nombre)

Apellidos
public String getApellidos()
public void setApellidos(String apellidos)

Edad
public int getEdad()
public void setEdad(int edad)

Sexo
public char getSexo()

Requisitos
Sexo tiene que ser de M o F
*/

public class TrabajadorImp implements Trabajador, Cloneable, Comparable<TrabajadorImp> {
    //Atributos
    private int IDTrabajador;
    private String nombre;
    private String apellidos;
    private int edad;
    private char sexo;
    private static int acumTrabajador = 1;

    //Constructor
    public TrabajadorImp() {
        IDTrabajador = acumTrabajador++;
        nombre = "Vacio";
        apellidos = "Vacio";
        edad = 0;
        sexo = 'a';
    }

    public TrabajadorImp(String nombre, String apellidos, int edad, char sexo) {
        IDTrabajador = acumTrabajador++;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
    }

    public TrabajadorImp(TrabajadorImp cop) {
        IDTrabajador = acumTrabajador++;
        this.nombre = cop.getNombre();
        this.apellidos = cop.getApellidos();
        this.edad = cop.getEdad();
        this.sexo = cop.getSexo();
    }

    //ID
    public int getID() {
        return IDTrabajador;
    }

    //Nombre
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Apellidos
    @Override
    public String getApellidos() {
        return apellidos;
    }

    @Override
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    //Edad
    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }

    //Sexo
    @Override
    public char getSexo() {
        return sexo;
    }

    //Metodos de la clase object
    //toString
    @Override
    public String toString() {
        return IDTrabajador + ", " + nombre + ", " + apellidos + ", " + edad + ", " + sexo;
    }

    //hashCode
    @Override
    public int hashCode() {
        return edad * 7 + nombre.hashCode() * apellidos.hashCode() * 21;
    }

    //Equals
    @Override
    public boolean equals(Object obj) {
        boolean res = false;

        if(this == obj) {
            res = true;
        }
        else if(obj != null && obj instanceof TrabajadorImp) {
            TrabajadorImp otro = (TrabajadorImp) obj;

            if(IDTrabajador == otro.getID()) {
                res = true;
            }
        }
        return res;
    }

    //Clone
    @Override
    public TrabajadorImp clone() {
        TrabajadorImp copia = null;
        try {
            copia = (TrabajadorImp) super.clone();
        }
        catch(CloneNotSupportedException err) {
            System.out.println("Objeto no clonado");
        }
        return copia;
    }

    //compareTo
    public int compareTo(TrabajadorImp otro) {
        int comparar = -1;

        if(IDTrabajador == otro.getID()) {
            comparar = 0;
        }
        else if(IDTrabajador > otro.getID()) {
            comparar = 1;
        }

        return comparar;
    }
}
