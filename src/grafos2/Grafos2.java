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
public class Grafos2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Nodo nodo1 = new Nodo("A");
        Nodo nodo2 = new Nodo("B");
        Nodo nodo3 = new Nodo("C");
        Nodo nodo4 = new Nodo("D");
        Nodo nodo5 = new Nodo("E");
        Grafo grafo = new Grafo();
        
        grafo.agregaNodo(new Nodo("A"));
        grafo.agregaNodo(nodo1);
        grafo.agregaNodo(nodo2);
        grafo.agregaNodo(nodo3);
        grafo.agregaNodo(nodo4);
        
        grafo.agregaArista(new Arista(nodo1,nodo2));
        grafo.agregaArista(new Arista(nodo2,nodo1));
        grafo.agregaArista(new Arista(nodo1,nodo1));
        
        
        
        
        
       
        grafo.imprimeRelaciones();
    }
    
}
