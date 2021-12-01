/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author s_ant
 */
public class ListaEnlazada {
    
    private NodoHash cabeza;
    private int tamano;

    /**
     * cosntructor de la clase ListaEnlazada
     */
    public ListaEnlazada() {
        cabeza = null;
        tamano = 0;
    }
    
    /**
     * Método que imprime la lista enlazada
     */
    public void imprimir() {
        NodoHash actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getPalabra() + "(" + actual.getRepeticiones() + ") -> ");
            actual = actual.getpNext();
        }
        System.out.print(" NULL\n");
    }
    
    /**
     * Método que valida si la lista está vacía
     * @return Retorna null si la lista está vacía
     */
    public boolean esVacia(){
        return cabeza == null;
    
    }
    
    /**
     * Método que inserta los elementos en la lista
     * @param nodo Recibe el nodo con el elemento que se desea insertar
     */
    public void insertarOrdenado(NodoHash nodo) {
        if (esVacia()) {
            cabeza = nodo;
        } else {
            NodoHash actual = cabeza;
            NodoHash anterior = null;
            int conteoInsertar = nodo.getRepeticiones();
            while (actual != null) {
                int conteoActual = actual.getRepeticiones();
                if (conteoInsertar > conteoActual) {
                    // si el conteo del nuevo nodo es mayor, entonces se coloca antes
                    if (anterior != null) {
                        anterior.setpNext(nodo);
                    } else {
                        cabeza = nodo;
                    }
                    nodo.setpNext(actual);
                    tamano++;
                    return;
                }
                anterior = actual;
                actual = actual.getpNext();
            }
            // si se llegó hasta aquí, entonces no se insertó nada. Este nodo tiene el menor conteo
            anterior.setpNext(nodo);
        }
        tamano++;
    }

    /**
     * Método que retorna la información de cabeza
     * @return Retorna cabeza
     */
    public NodoHash getCabeza() {
        return cabeza;
    }

    /**
     * Método que retorna el tamaño de la lista
     * @return Retorna tamano
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * Método que define a cabeza
     * @param cabeza Recibe el elemento a almacenar en cabeza
     */
    public void setCabeza(NodoHash cabeza) {
        this.cabeza = cabeza;
    }
    
    /**
     * Metodo que define el tamaño de la lista
     * @param tamano Recibe el tamaño de la lista
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    
//    /**
//     * Método que desine
//     * @param indice
//     * @return 
//     */
//    public NodoHash elementoEn(int indice) {
//       if (indice > tamano || indice < 0) {
//           return null;
//       }
//       
//       return elementoEn(indice, cabeza);
//   }
//   
//    private NodoHash elementoEn(int indice, NodoHash nodo) {
//       if (indice == 0) {
//           return nodo;
//       }
//       
//       return elementoEn(indice-1, nodo.getpNext());
//   }
}
    

    
