package interfaces;

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
public interface Trabajador {
    //IDTrabajador
    public int getID();

    //Nombre
    public String getNombre();
    public void setNombre(String nombre);

    //Apellidos
    public String getApellidos();
    public void setApellidos(String apellidos);

    //Edad
    public int getEdad();
    public void setEdad(int edad);

    //Sexo
    public char getSexo();
}
