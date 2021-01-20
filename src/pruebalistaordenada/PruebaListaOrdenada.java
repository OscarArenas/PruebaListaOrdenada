package pruebalistaordenada;

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
//package pruebalistaordenada;
import modelo.ListaOrdenada;

/**
 *
 * @author Oscar Arenas
 */
public class PruebaListaOrdenada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaOrdenada lista = new ListaOrdenada();

        System.out.println("Lista: " + lista);

        lista.agregar(34);
        lista.agregar(14);
        lista.agregar(20);
        lista.agregar(5);
        lista.agregar(95);
        lista.agregar(20);

        System.out.println("Lista: " + lista);
    }
}
