/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author antonio
 */
public class Grafo {
    private ArrayList<Nodo> listaNodo = new ArrayList<>();
    private ArrayList<Arista> listaArista = new ArrayList<>(); 
    private boolean dirigido = false; 
    
    /**
     * Revisa si Existe el nodo dentro de la lista
     * @param nodo Nodo que se va a revisar
     * @return True Existe el nodo False: No existe 
     */
    public boolean existeNodo(Nodo nodo)
    {
        for(Nodo n : listaNodo)
        {
            if(nodo.getNombre().equals(n.getNombre()))
            {
                return true;
            }
        }
        
        return false;   
    
    }
    /**
     * Revisa si existe la arista dentro del grafo
     * @param arista
     * @return 
     */
    public boolean existeArista(Arista arista)
    {
        for(Arista a : listaArista)
        {
            if(arista.imprimeRelacion().equals(a.imprimeRelacion()))
            {
                return true;
            }
        }
        
        return false;
    }
    /**
     * Agrega la opcion al grafo sobre si es dirigido o no, si no es dirigido cuando se agrega una arista se agregara tambien su contraparte
     * por ejemplo, a->b tambien se agregara b->a, y si dirigido solo se agrega solo el nodo
     * @param opc 
     */
    public void setDirigido(boolean opc)
    {
        dirigido = opc;
    }
    /**
     * Agregas un nuevo objeto nodo a la lista
     * @param nodo 
     */
    public void agregaNodo(Nodo nodo)
    {
        if(!this.existeNodo(nodo))
        {
            listaNodo.add(nodo);
        }
        else
        {
            System.out.println("El nodo que intentas agregar ya existe!!");
        }
        
    }
    
    public void agregaArista(Arista arista)
    {
        if(!existeArista(arista))
        {
            
            //Si el grafo no es dirigido agregamos la contraparte ejemplo: si la arista es a->b entonces agregamos b->a
            if(!dirigido)
            {
               
                listaArista.add(arista);
                if(!existeArista(arista.obtenerContraparte()))
                {
                   listaArista.add(arista.obtenerContraparte());
                }
            }
            else
            {
                listaArista.add(arista);
            }
           
 
        }
        else
        {
            System.out.println("Error la arista ya existe en el grafo");
        }
    }
    
    public void imprimeRelaciones()
    {
        for(Arista a : listaArista)
        {
            System.out.println(a.imprimeRelacion());
        }
    }
    
    
    /**
     * Imprime una lista de adyacencia
     */
    public void imprimeListaAdyacencia()
    {
        for(Nodo nodo : listaNodo)
        {
            System.out.print(nodo.getNombre() +" -> ");
            for(Arista arista : listaArista)
            {
                
                if(nodo.equals(arista.getInicio()))
                {
                    System.out.print(arista.getFin().getNombre() + " -> ");
                }
            }
            System.out.println(" ");
        }
    }
    
    public void getListaAdyacencia()
    {
        List<Nodo> lista = new ArrayList<>();
        Nodo inicial;//Con que nodo iniciamos
        Nodo actual; //el nodo actual
        for(Nodo n : listaNodo) //Recorremos todos los nodos
        {
            actual = n;
            inicial = n;
            for(Arista arista : listaArista)
            {
                if(n.equals(arista.getInicio()))
                {
                    actual.setSiguiente(arista.getFin());
                    actual = arista.getFin();
                }
            }
            actual.setSiguiente(null);
            lista.add(inicial);
        }
        System.out.println("");
        
    }
    
    
}
