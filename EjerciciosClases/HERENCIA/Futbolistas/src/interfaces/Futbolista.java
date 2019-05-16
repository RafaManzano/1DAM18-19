package interfaces;

/*
Propiedades Basicas
Nombre
Tipo: String
Cons: Si
Mod: Si

Apellidos
Tipo: String
Cons: Si
Mod: Si

Alias
Tipo: String
Cons: Si
Mod: Si

Dorsal
Tipo: int
Cons: Si
Mod: Si

Edad
Tipo: int
Cons: Si
Mod: Si

Propiedades derivadas
No hay

Propiedades compartidas
No hay

Get and Set
Nombre
public String getNombre()
public void setNombre (String nombre)

Apellidos
public String getApellidos()
public void setApellidos (String apellidos)

Alias
public String getAlias()
public void setAlias (String alias)

Dorsal
public int getDorsal()
public void setDorsal(int dorsal)

Edad
public int getEdad()
public void setEdad(int edad)

Requisitos
Dorsal tiene que ser de 1 a 99
Edad tiene que ser de mayor de 16

Metodos anhadidos
No hay
 */
public interface Futbolista {
    //Nombre
    public String getNombre();
    public void setNombre (String nombre);

    //Apellidos
    public String getApellidos();
    public void setApellidos (String apellidos);

    //Alias
    public String getAlias();
    public void setAlias (String alias);

   //Dorsal
    public int getDorsal();
    public void setDorsal(int dorsal);

   //Edad
    public int getEdad();
    public void setEdad(int edad);
}
