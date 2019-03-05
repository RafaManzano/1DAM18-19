package conductores;

import clases.SocioImp;
import gestora.gestoraPadelSocio;
import validaciones.validacionesPadel;

public class conductorValidaciones {
    public static void main(String[] args) {
        validacionesPadel validaciones = new validacionesPadel();
        gestoraPadelSocio gestoraS = new gestoraPadelSocio();
        SocioImp[] socios = gestoraS.generarArraySocios();

        validaciones.validarOpciones2();
        validaciones.validarOpciones3();
        validaciones.validarOpciones5();
        validaciones.validarCuota();
        validaciones.validarGenero();
        validaciones.validarEdad();
        validaciones.validarHora();
        validaciones.validarNumeroPista();
        validaciones.validarSocio();
        validaciones.validarPista(socios);
    }
}
