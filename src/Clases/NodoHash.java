/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Jose
 */
public class NodoHash {
    private NodoHash pNext;
    private String palabra;
    private int repeticiones;
    
    /**
     * Constrictor de la clase NodoHash
     * @param palabra Recibe las palabras que se encuentran en el archivo txt
     * @param repeticiones Recibe el número de repeticiones de cada palabra
     */
    public NodoHash(String palabra, int repeticiones){
        this.palabra = palabra;
        this.repeticiones = repeticiones;
        this.pNext = null;
    }

    /**
     * @return the pNext
     */
    public NodoHash getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(NodoHash pNext) {
        this.pNext = pNext;
    }

    /**
     * @return the dato
     */
    public String getPalabra() {
        return palabra;
    }

    /**
     * @param dato the dato to set
     */
    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    /**
     * @return the repeticiones
     */
    public int getRepeticiones() {
        return repeticiones;
    }

    /**
     * @param repeticiones the repeticiones to set
     */
    public void setRepeticiones(int repeticiones) {
        this.repeticiones = repeticiones;
    }
    
    
}
