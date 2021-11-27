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

    public ListaEnlazada() {
        cabeza = null;
        tamano = 0;
    }
    
    public void imprimir() {
        NodoHash actual = cabeza;
        while (actual != null) {
            System.out.print(actual.getPalabra() + "(" + actual.getRepeticiones() + ") -> ");
            actual = actual.getpNext();
        }
        System.out.print(" NULL\n");
    }
    
    
    public boolean esVacia(){
        return cabeza == null;
    
    }
    
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

    public NodoHash getCabeza() {
        return cabeza;
    }


    public int getTamano() {
        return tamano;
    }

    public void setCabeza(NodoHash cabeza) {
        this.cabeza = cabeza;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    
   public NodoHash elementoEn(int indice) {
       if (indice > tamano || indice < 0) {
           return null;
       }
       
       return elementoEn(indice, cabeza);
   }
   
   private NodoHash elementoEn(int indice, NodoHash nodo) {
       if (indice == 0) {
           return nodo;
       }
       
       return elementoEn(indice-1, nodo.getpNext());
   }
}
    

    
