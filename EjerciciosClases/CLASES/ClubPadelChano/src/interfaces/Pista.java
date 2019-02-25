package interfaces;

import clases.SocioImp;

public interface Pista {
    //Numero
    public int getNumero();

    //SocioImp
    public SocioImp getSocio();
    public void setSocio(SocioImp socio);

    //Hora
    public int getHora();
    public void setHora(int hora);

    //Rechazada
    public boolean getRechazada();
    public void setRechazada(boolean rechazada);
}
