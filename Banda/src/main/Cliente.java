/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import concierto.Banda;
import concierto.Interprete;
import java.util.ArrayList;

/**
 *
 * @author Estudiantes
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Banda organizacion = new Banda();
        organizacion.crearBanda();
        
        ArrayList<Interprete> interprete = organizacion.getBanda();
        int i = 1;
        for (Interprete next : interprete) {
            next.mostrarInterprete(i);
            i++;
        }

    }    

    
}
