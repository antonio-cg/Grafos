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
    
    public Nodo(String nombre)
    {
        this.nombre = nombre;
    }

    String getNombre() {
        return nombre;
    }
    
}
