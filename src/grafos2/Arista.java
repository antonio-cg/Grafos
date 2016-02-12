/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos2;

/**
 *
 * @author antonio
 */
public class Arista {
    
    private Nodo inicia;
    private Nodo termina;
    private double peso = 0;
    private double heuristica = 0;
    
    public Arista(Nodo inicia, Nodo termina)
    {
        this.inicia = inicia;
        this.termina = termina;
    }
    
    public Arista(Nodo inicia, Nodo termina, double peso)
    {
        this.inicia = inicia;
        this.termina  = termina;
        this.peso = peso;
    }
    
    public Arista(Nodo inicia, Nodo termina, double peso, double heuristica)
    {
    
        this.inicia = inicia;
        this.termina = termina;
        this.peso = peso;
        this.heuristica = heuristica;
    }
    
    public String imprimeRelacion()
    {
        return inicia.getNombre() + ":" + termina.getNombre();
    }
    
    public Arista obtenerContraparte()
    {
        return new Arista(termina,inicia);
    }
    
    public Nodo getFin()
    {
        return termina;
    }
    
    public Nodo getInicio()
    {
        return inicia;
    
    }
    

}
