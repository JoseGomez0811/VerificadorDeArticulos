/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Jose
 */
public class HashTable {
    NodoHash tabla[];
    int size;
    
    /**
     * Constructor de la clase HashTable
     * @param size Recibe el tamaño de la tabla
     */
    public HashTable(int size){
        this.size = size;
        this.tabla = new NodoHash[this.size];
        for(int i = 0; i < this.size; i++){
            this.tabla[i] = null;
        }
    }
    
    /**
     * Método que genera la posición en la que almacenará la palabra a insertar
     * @param clave Recibe la palabra que se desea insertar
     * @return Retorna la posición en que insertará la palabra
     */
    public int hashing(String clave){
        int indice = 0;
        
        for(int i = 0; i < clave.length(); i++){
            indice = clave.codePointAt(i) % 7;
           
            while(tabla[indice] != null){
                if(this.tabla[indice].getPalabra().equals(clave)){
                    break;
                }else{
                    indice++;
                    indice %= this.size;
                }
           }
        }
        return indice;
    }
    
    /**
     * Método que inserta las palabras en la tabla
     * @param palabra Recibe la palabra que se desea insertar
     */
    public void insertar(String palabra){
        int posicion = hashing(palabra);
        boolean existe = false;
        
        if(this.tabla[posicion] != null){
            NodoHash pTemp = this.tabla[posicion];
            if(pTemp.getPalabra().equals(palabra)){
                existe = true;
                int repeticiones = pTemp.getRepeticiones() + 1;
                NodoHash pNew = new NodoHash(palabra, repeticiones);
                this.tabla[posicion] = pNew;
            }
            while(pTemp.getpNext() != null){
                pTemp = pTemp.getpNext();
                if(pTemp.getPalabra().equals(palabra)){
                    existe = true;
                }
            }
            if(!existe){
                int repeticiones = 1;
                NodoHash pNew = new NodoHash(palabra, repeticiones);
                pTemp.setpNext(pNew);
            }
        }else{
            int repeticiones = 1;
            NodoHash pNew = new NodoHash(palabra, repeticiones);
            this.tabla[posicion] = pNew;
        }
    }
    
    /**
     * Método que busca una palabra en la tabla
     * @param palabra Recibe la palabra que se desea buscar
     * @return Retorna la palabra a buscar con el número de repeticiones
     */
    public NodoHash buscar(String palabra){
        int posicion = hashing(palabra);
        NodoHash pTemp = this.tabla[posicion];
        boolean existe = false;
        
        if(pTemp != null){
            if(pTemp.getpNext() == null){
                existe = true;
            }else{
                while(pTemp.getpNext() != null && !existe){
                    if(pTemp.getPalabra().equals(palabra)){
                        existe = true;
                    }else{
                        pTemp = pTemp.getpNext();
                    }
                }
            }
        }
        if(existe){
            JOptionPane.showMessageDialog(null, "Palabra: " + pTemp.getPalabra() + " - Repeticiones: " + pTemp.getRepeticiones());
            return pTemp;
        }else{
            JOptionPane.showMessageDialog(null, "La palabra a buscar no se encuentra en el texto");
            return null;
        }
    }
    
    /**
     * Método que vacía la tabla
     */
    public void vaciado(){
        for(int i = 0; i < this.size; i++){
            this.tabla[i] = null;
        }
    }
    
    /**
     * Método que imprime la tabla
     * @return Retorna la información almacenada en la tabla
     */
    public String imprimir(){
        String tabla = "";
        for(int i = 0; i < this.size; i++){
            if(this.tabla[i] != null){
                tabla += "Palabra: " + this.tabla[i].getPalabra() + " - Repeticiones: " + this.tabla[i].getRepeticiones() + "\n";
                if(this.tabla[i].getpNext() != null){
                    NodoHash pTemp = this.tabla[i].getpNext();
                    while(pTemp != null){
                        tabla += "Palabra: " + this.tabla[i].getPalabra() + " - Repeticiones: " + this.tabla[i].getRepeticiones() + "\n";
                        pTemp = pTemp.getpNext();
                    }
                }
            }
        }
        return tabla;
    }
    
    /**
     * Método que inserta los elementos de la tabla en una lista simple
     * @return Retorna la lista simple
     */
    public ListaEnlazada ordenarFrecuencias() {
        ListaEnlazada listaEnlazada = new ListaEnlazada();
        for (int i = 0; i < size; i++) {
            if (null != tabla[i]) {
                listaEnlazada.insertarOrdenado(tabla[i]);
            }
        }
        return listaEnlazada;
    }
}
