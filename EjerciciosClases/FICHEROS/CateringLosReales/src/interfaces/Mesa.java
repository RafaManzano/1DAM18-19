package interfaces;

/*
Propiedaes basicas
ID
Tipo: int
Cons: Si
Mod: No

numComensales
Tipo: int
Cons: Si
Mod: Si

Propiedades derivadas
No hay

Propiedades compartidas
acumMesas
Tipo: int
Cons: Si
Mod: No

Get and Set
ID
public int getID()

numComensales
public int getNumComensales()
public void setNumComensales(int numComensales)

Requisitos
numComensales es mayor que 1
*/

public interface Mesa {
    //ID
    public int getID();

    //numComensales
    public int getNumComensales();
    public void setNumComensales(int numComensales);
}
