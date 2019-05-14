package interfaces;

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

import clases.MesaImp;
import enumeraciones.EnumTurno;

public interface Camarero {

    //ID
    public int getID();
    public void setID(int id);

    //Nombre
    public String getNombre();
    public void setNombre(String nombre);

    //Apellidos
    public String getApellidos();
    public void setApellidos(String apellidos);

    //Turno
    public EnumTurno getTurno();
    public void setTurno(EnumTurno turno);

    //Mesas
    public MesaImp[] getMesas();
    public void setMesas(MesaImp[] mesas);
}
