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
    Nodo siguiente; // solo para lista de adyacencia
    private double peso; // solo para lista de adyacencia
    private double heuristica; // SOlo para la lista de adyacencia
    
    private Nodo(String nombre, Nodo siguiente,boolean visitado,double peso, double heuristica) {
        this.nombre = nombre;
        this.siguiente = siguiente;
        this.visitado = visitado;
        this.peso = peso;
        this.heuristica = heuristica;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getHeuristica() {
        return heuristica;
    }

    public void setHeuristica(double heuristica) {
        this.heuristica = heuristica;
    }
    

    

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
    public Nodo(String nombre)
    {
        this.nombre = nombre;
    }

    String getNombre() {
        return nombre;
    }
    
    /**
     * Retorna una nueva instancia de un nodo dado
     * @param n
     * @return 
     */
    static Nodo nuevaInstancia(Nodo n)
    {
        return new Nodo(n.nombre,n.siguiente,n.visitado,n.peso,n.heuristica);
    }
    
}
