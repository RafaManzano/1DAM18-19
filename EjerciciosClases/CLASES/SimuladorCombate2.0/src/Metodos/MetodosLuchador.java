/*
 * MetodosLuchador
 */

package Metodos;
import Clases.*;
public class MetodosLuchador {

	//MenuPersonaje
	public static void menuPersonaje() {
		System.out.println("Elige un personaje");
		System.out.println("1. Kratos");
		System.out.println("2. Ezio");
		System.out.println("3. Aloy");
		System.out.println("4. Geralt");
		System.out.println("5. Dante");
		System.out.println("6. CJ");
		System.out.println("7. Sora");
		System.out.println("8. Ellie");
	}
	
	public static Ataque[] creandoHabilidades(Ataque[] habilidades) {
		
		habilidades[0] = new Ataque("Leviatan", 12, false);
		habilidades[1] = new Ataque("Ataque Devastador", 10, false);
		habilidades[2] = new Ataque("Poder Griego", 2, true);
		habilidades[3] = new Ataque("Furia de Titanes", 20, false);
		habilidades[4] = new Ataque("Hoja Oculta", 20, false);
		habilidades[5] = new Ataque("Arco", 16, false);
		habilidades[6] = new Ataque("Escondite", 2, true);
		habilidades[7] = new Ataque("Silbido", 17, false);
		habilidades[8] = new Ataque("Lanzallamas", 20, false);
		habilidades[9] = new Ataque("Congelacion", 2, true);
		habilidades[10] = new Ataque("Arco", 12, false);
		habilidades[11] = new Ataque("Aguja", 11, false);
		habilidades[12] = new Ataque("Mordisco", 20, false);
		habilidades[13] = new Ataque("Resistencia", 2, true);
		habilidades[14] = new Ataque("Espadazo", 15, false);
		habilidades[15] = new Ataque("Fuego Fatuo", 14, false);
		habilidades[16] = new Ataque("Ebano y Marfil", 12, false);
		habilidades[17] = new Ataque("Poder Sparda", 20, false);
		habilidades[18] = new Ataque("Yamato", 15, false);
		habilidades[19] = new Ataque("Chuleria", 2, true);
		habilidades[20] = new Ataque("Coche Bomba", 20, false);
		habilidades[21] = new Ataque("Atraco", 16, false);
		habilidades[22] = new Ataque("Chaleco", 2, true);
		habilidades[23] = new Ataque("Rifle", 15, false);
		habilidades[24] = new Ataque("Pato Donald", 14, false);
		habilidades[25] = new Ataque("Mickey", 20, false);
		habilidades[26] = new Ataque("Riku", 5, true);
		habilidades[27] = new Ataque("Goofy", 13, false);
		habilidades[28] = new Ataque("Bomba Humo", 2, true);
		habilidades[29] = new Ataque("Pistola Ellie", 20, false);
		habilidades[30] = new Ataque("Joel", 15, false);
		habilidades[31] = new Ataque("Bomba Clavo", 15, false);
		return habilidades;
	}
	
	public static Luchador[] creandoPersonajes (Ataque[] p1, Ataque[] p2, Ataque[] p3, Ataque[] p4, Ataque[] p5, Ataque[] p6, Ataque[] p7, Ataque[] p8) {
		Luchador[] luchadores = new Luchador[8];
		luchadores[0] = new Luchador("Kratos", p1, 83, 5, 7, "Destroza Dioses", "Mejora un poco el ataque");
		luchadores[1] = new Luchador("Ezio", p2, 85, 9, 5, "Sigilo", "Mejora un poco la defensa");
		luchadores[2] = new Luchador("Aloy", p3, 90, 5, 5, "Mujeres al poder", "Mejora todas sus estadisticas");
		luchadores[3] = new Luchador("Geralt", p4, 69, 4, 8, "Alma de lobo", "Mejora un poco el ataque");
		luchadores[4] = new Luchador("Dante", p5, 97, 10, 5, "Demonio", "Mejora un pooo su vida");
		luchadores[5] = new Luchador("CJ", p6, 79, 10, 7, "Pandilla", "Mejora un poco todos sus ataques");
		luchadores[6] = new Luchador("Sora", p7, 84, 5, 7, "Espada Llave", "Mejora un poco el ataque");
		luchadores[7] = new Luchador("Ellie", p8, 94, 10, 3, "Inmunidad", "Mejora un poco la defensa");
		return luchadores;
	}

	public static void menuMovimiento(Luchador personaje){
		System.out.println("Elija una opcion");
		System.out.println("1. " + personaje.getNombreMov(0));
		System.out.println("2. " + personaje.getNombreMov(1));
		System.out.println("3. " + personaje.getNombreMov(2));
		System.out.println("4. " + personaje.getNombreMov(3));
	}
	
	public static Luchador mejorarHabilidad (Luchador jug) {
	if(jug.getNombre() == "Kratos" || jug.getNombre() == "Geralt" || jug.getNombre() == "Sora") {
		jug.setAtaque(jug.getAtaque() + 10);
	}
	else if (jug.getNombre() == "Ezio" || jug.getNombre() == "Ellie") {
			jug.setDefensa(jug.getDefensa() + 10);	
		 }
		 else if (jug.getNombre() == "Aloy") {
			 jug.setAtaque(jug.getAtaque() + 10);
			 jug.setDefensa(jug.getDefensa() + 10);	
			  }
			  else if(jug.getNombre() == "CJ") {
				  jug.setDanioMov(jug.getDanioMov(0) + 5, 0);
				  jug.setDanioMov(jug.getDanioMov(1) + 5, 1);
				  jug.setDanioMov(jug.getDanioMov(2) + 5, 2);
				  jug.setDanioMov(jug.getDanioMov(3) + 5, 3);
				  }
				  else {
					  jug.setVida(jug.getVida() + 20);
				  }
						
		return jug;
	}
	
	public static Luchador ataqueMejorado(Luchador jug, int numataque) {
		if (jug.getNombre() == "Kratos" || jug.getNombre() == "Ezio" || jug.getNombre() == "Aloy" || jug.getNombre() == "Geralt" || jug.getNombre() == "CJ" || jug.getNombre() == "Ellie"){
			if (jug.getDefensa() < 25) { 
			jug.setDefensa(jug.getDefensa() + jug.getDanioMov(numataque));			
			}
		}
		else if (jug.getNombre() == "Sora") {
			jug.setVida(jug.getVida() +  jug.getDanioMov(numataque));
		     }
		     else if (jug.getNombre() == "Dante") {
				 if (jug.getAtaque() < 35) {
				 jug.setAtaque(jug.getAtaque() + jug.getDanioMov(numataque));
				 }
			 }
		return jug;
	}

}

