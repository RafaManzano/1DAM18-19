package interfaces;

import clases.CasillaImp;

public interface Tablero {

	public CasillaImp[] getCasillas();
	public void setCasillas(CasillaImp[] casillas);
}
