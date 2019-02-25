package clases;

/*
* PistaImp
* Numero
* Tipo: int
* Cons: Si
* Mod: No
*
* Socio
* Tipo: SocioImp
* Cons: Si
* Mod: Si
*
* Hora
* Tipo: int
* Cons: Si
* Mod: Si
*
* Rechazada
* Tipo: boolean
* Cons: Si
* Mod: Si
*
* Propiedades derivadas
* No hay
*
* Propiedades compartidas
* No hay
*
* Get and Set
* Numero
* public int getNumero()
*
* SocioImp
* public SocioImp getSocio()
* public void setSocio(SocioImp socio)
*
* Hora
* public int getHora()
* public void setHora(int hora)
*
* Rechazada
* public boolean getRechazada()
* public void setRechazada(boolean rechazada)
*
* Requisitos
* Hora tiene que ser de 0 a 23
* Numero de 0 a 9
*/

import interfaces.Pista;

import java.util.Objects;

public class PistaImp implements Pista, Cloneable {

    //Atributos
    private int numero;
    private SocioImp socio;
    private int hora;
    private boolean rechazada;

    //Constructor
    public PistaImp() { //Por defecto
        numero = 0;
        socio = new SocioImp();
        hora = 0;
        rechazada = false;
    }

    public PistaImp(int numero, SocioImp socio, int hora, boolean rechazada) { //Con parametros
        this.numero = numero;
        this.socio = socio;
        this.hora = hora;
        this.rechazada = rechazada;
    }

    public PistaImp(PistaImp cop) { //de copia
        this.numero = cop.getNumero();
        this.socio = cop.getSocio();
        this.hora = cop.getHora();
        this.rechazada = cop.getRechazada();
    }

    //Get and Set
    //Numero
    public int getNumero() {
        return numero;
    }

    //Socio
    public SocioImp getSocio() {
        return socio;
    }

    public void setSocio(SocioImp socio) {
        this.socio = socio;
    }

    //Hora
    public int getHora() {
        return hora;
    }


    public void setHora(int hora) {
        this.hora = hora;
    }

    //Rechazada
    public boolean getRechazada() {
        return rechazada;
    }

    public void setRechazada(boolean rechazada) {
        this.rechazada = rechazada;
    }

    //Metodos de la clase object
    //toString
    @Override
    public String toString() {
        return numero + ", " + socio + ", " + hora + ", " + rechazada;
    }

    //hashCode
    @Override
    public int hashCode() {
        return numero * hora * 7 * 21;
    }

    //equals
    @Override
    public boolean equals(Object obj) {
        boolean res = false;

        if (this == obj) {
            res = true;
        }
        else if (obj != null && obj instanceof PistaImp) {
            PistaImp otro = (PistaImp) obj;

            if (this.numero == otro.getNumero()) {
                res = true;
            }
        }

        return res;
    }

    //clone

    @Override
    public PistaImp clone() {
        PistaImp copia = null;

        try {
            copia = (PistaImp)super.clone();
        }
        catch(CloneNotSupportedException err) {
            System.out.println("Objeto no clonado");
        }
        return copia;
    }




}
