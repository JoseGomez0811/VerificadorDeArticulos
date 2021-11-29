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
    int size; // 10111
    
    public HashTable(int size){
        this.size = size;
        this.tabla = new NodoHash[this.size];
        for(int i = 0; i < this.size; i++){
            this.tabla[i] = null;
        }
    }
    
//    public int hashing2(String clave){
//        int valor = 0;
//        int posicion = 1;
//        
//        for(int i = 0; i < clave.length(); i++){
//            if(clave.codePointAt(i) == 32){
//                valor += 0;
//            }else if(clave.codePointAt(i) >= 48 && clave.codePointAt(i) <= 57){
//                valor += ((clave.codePointAt(i) - 47) * posicion);
//            }else if(clave.codePointAt(i) >= 65 && clave.codePointAt(i) <= 90){
//                valor += ((clave.codePointAt(i) - 54) * posicion);
//            }else if(clave.codePointAt(i) >= 97 && clave.codePointAt(i) <= 122){
//                valor += ((clave.codePointAt(i) - 60) * posicion);
//            }
//            posicion++;
//        }
//        return (valor % this.size);
//    }
    
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
//        JOptionPane.showMessageDialog(null, "OK");
    }
    
//    public void insertar2(String palabra){
//        int posicion = hashing(palabra);
//        //int repeticiones = 0;
//        NodoHash pTemp = this.tabla[posicion];
//        
//        if(pTemp != null){
//            if(pTemp.getPalabra().equals(palabra)){
//                int repeticiones = pTemp.getRepeticiones() + 1;
//                NodoHash pAux = new NodoHash(palabra, repeticiones);  //Posible cambio: NodoHash pAux = new NodoHash(palabra, repeticiones);
//                while(pTemp.getpNext() != null){
//                    pTemp = pTemp.getpNext();
//                }
//                pTemp.setpNext(pAux);
//            }
//        }else{
//            int repeticiones = 0;
//            NodoHash pAux = new NodoHash(palabra, repeticiones);  //Posible cambio: NodoHash pAux = new NodoHash(palabra, repeticiones);
//            this.tabla[posicion] = pAux;
//        }
//    }
    
    public NodoHash buscar(String palabra){
        int posicion = hashing(palabra);
        NodoHash pTemp = this.tabla[posicion];
        boolean existe = false;
        
        if(pTemp != null){
            if(pTemp.getpNext() == null){   //Buscar validacion de que el unico nodo en la tabla sea el que estoy buscando.
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
    
    public void vaciado(){
        for(int i = 0; i < this.size; i++){
            this.tabla[i] = null;
        }
    }
    
    public String imprimir(){
        String tabla = "";
        for(int i = 0; i < this.size; i++){
            if(this.tabla[i] != null){
                tabla += "Palabra: " + this.tabla[i].getPalabra() + " - Repeticiones: " + this.tabla[i].getRepeticiones() + "\n";
//                JOptionPane.showMessageDialog(null, "Palabra: " + this.tabla[i].getPalabra() + " - Repeticiones: " + this.tabla[i].getRepeticiones());
                if(this.tabla[i].getpNext() != null){
                    NodoHash pTemp = this.tabla[i].getpNext();
                    while(pTemp != null){
                        tabla += "Palabra: " + this.tabla[i].getPalabra() + " - Repeticiones: " + this.tabla[i].getRepeticiones() + "\n";
//                        JOptionPane.showMessageDialog(null, "Palabra: " + pTemp.getPalabra() + " - Repeticiones: " + this.tabla[i].getRepeticiones());
                        pTemp = pTemp.getpNext();
                    }
                }
            }
        }
        return tabla;
    }
    
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
