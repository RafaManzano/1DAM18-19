/*
 * piramides.java
 * 
 * Copyright 2018 rmanzano <rmanzano@106-22>
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


public class piramides {
	
	public static void main (String[] args) {
		int numFilas = 5;
		
		for(int contador = 1; contador <= numFilas; contador++) {
			for (int blancos = 1; blancos <= numFilas - contador; blancos++){
				System.out.print(" ");
			}
			for (int cont = 1; cont <= (contador * 2) -1; cont++) {
				System.out.print(1);
				
			}
			System.out.println();
		}
	}
}

