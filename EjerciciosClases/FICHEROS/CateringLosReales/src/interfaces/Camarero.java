package interfaces;

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
*/

public interface Camarero {

    //ID
    public int getID();

    //Nombre
    public String getNombre();
    public void setNombre(String nombre);

    //Apellidos
    public String getApellidos();
    public void setApellidos(String apellidos);

}
