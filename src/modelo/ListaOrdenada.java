/*
 * Copyright (C) 2019 Oscar Arenas
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package modelo;

/**
 *
 * @author Oscar Arenas
 */
public class ListaOrdenada {

    // Campos (Atributos)
    private int[] datos;
    private int n; // Tamaño de la lista

    // Métodos (Operaciones)
    public ListaOrdenada() {
        datos = new int[1];
        n = 0;
    }

    public void agregar(int dato) {
        if (datos.length == n) {
            cambiarCapacidad(2 * n);
        }
        // Calculamos la posición del último elemento de la lista
        int i = n - 1;

        while (i >= 0 && dato < datos[i]) {
            datos[i + 1] = datos[i];
            i--;
        }

        datos[i + 1] = dato;
        n++;
    }

    private void cambiarCapacidad(int nc) {
        if (nc > 0 && nc >= n) {
            int[] nuevoVector = new int[nc];

            for (int i = 0; i < n; i++) {
                nuevoVector[i] = datos[i];
            }
            datos = nuevoVector;
        }
    }

    @Override
    public String toString() {
        String cadena = "";

        if (n > 0) {
            for (int i = 0; i < n - 1; i++) {
                cadena += datos[i] + ", ";
            }
            cadena += datos[n - 1];
        }
        return "[" + cadena + "]";
    }
}