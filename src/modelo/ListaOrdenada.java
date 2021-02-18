/*
 * Copyright (C) 2020 Oscar Arenas
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
    private double[] datos;
    private int n; // Tamaño de la lista

    // Métodos (Operaciones)
    public ListaOrdenada() {
        datos = new double[1];
        n = 0;
    }

    public void agregar(double dato) {
        if (datos.length == n) {
            cambiarCapacidad(2 * n);
        }
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
            double[] nuevoVector = new double[nc];

            for (int i = 0; i < n; i++) {
                nuevoVector[i] = datos[i];
            }
            datos = nuevoVector;
        }
    }

    /**
     * Borra de la lista el valor ubicado en el índice especificado. El borrado
     * se realiza desplazando todos los elementos que estan después del ubicado
     * en el índice especificado una posición a la izquierda.
     *
     * @param indice Entero que indica la posición del valor a borrar
     * @return Retorna true si elimina el valor y false en caso contrario
     */
    public boolean eliminar(int indice) {
        if (indice >= 0 && indice < n) {
            n--;
            while (indice < n) {
                datos[indice] = datos[indice + 1];
                indice++;
            }
            if (datos.length / 4 == n) {
                cambiarCapacidad(datos.length / 2);
            }
            return true;
        }
        return false;
    }

    public int tamanio() {
        return n;
    }

    public boolean esVacia() {
        return n == 0;
    }

    @Override
    public String toString() {
        if (esVacia()) {
            return "[]";
        }

        String cadena = datos[0] + "";

        for (int i = 1; i < n; i++) {
            cadena += ", " + datos[i];
        }
        return "[" + cadena + "]";
    }
}
