/*
 * testPersona.java
 * 
 * Copyright 2019 rmanzano <rmanzano@106-14>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class testPersona {
	
	public static void main (String[] args) {
	Persona p1 = new Persona ("nombre", 20, "hola", TipoSexo.NODEFINIDO, 19,2);
	Persona p2 = new Persona();
	Persona p3 = new Persona();
	Persona p4 = new Persona(p2);
	Persona p5 = new Persona(p2);
	
	System.out.println(p3.getID());
	System.out.println(p1.getID());
	System.out.println(p2.getID());
	System.out.println(p4.getID());
	System.out.println(p5.getID());
		/*
		try {
			p1.setAltura(-1);
		}
		catch(ExcepcionPersona error) {
			System.out.println("ERROR " + error);
		}
		
		try {
			p1.setPeso(0);
		}
		catch(ExcepcionPersona error) {
			System.out.println("ERROR " + error);
		}
		
		System.out.println(p1.getSexo());
		p1.setSexo(TipoSexo.MUJER);
		System.out.println(p1.getSexo());
		*/
		
		
		
	}
}

