/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces.Modelos;

import Clases.ListaEnlazada;
import Clases.NodoHash;
import javax.swing.table.AbstractTableModel;

public class FrecuenciaPalabrasTableModel extends AbstractTableModel {
    private ListaEnlazada lista;
    private final NodoHash[] arrayNodos;
    private final static String[] CABECERAS = new String[] {"Palabra", "Repeticiones"};

    public FrecuenciaPalabrasTableModel(ListaEnlazada lista) {
        this.lista = lista;
        arrayNodos = new NodoHash[this.lista.getTamano()];
        NodoHash nodo = this.lista.getCabeza();
        for (int i = 0; i < this.lista.getTamano(); i++, nodo = nodo.getpNext()) {
            arrayNodos[i] = nodo;
        }
    }
    
    
    
    @Override
    public int getRowCount() {
        return lista.getTamano();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (rowIndex > getRowCount() -1 || columnIndex > getColumnCount() -1) {
            return null;
        }
        
        NodoHash nodo = arrayNodos[rowIndex];
        switch (columnIndex) {
            case 0: return nodo.getPalabra();
            case 1: return nodo.getRepeticiones();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int column) {
        return CABECERAS[column];
    }
    
    
}
