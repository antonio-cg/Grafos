/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos2;

import java.util.ArrayList;

/**
 *
 * @author antonio
 */
public class Nodo {
    
    private String nombre;
    private boolean visitado ; 

    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
    Nodo siguiente;
    
    public Nodo(String nombre)
    {
        this.nombre = nombre;
    }

    String getNombre() {
        return nombre;
    }
    
}
