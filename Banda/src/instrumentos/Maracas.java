/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentos;

import concierto.Instrumento;

/**
 *
 * @author Estudiantes
 */
public class Maracas extends Instrumento{

    @Override
    public void afinar() {
        System.out.println("Alistando Maracas");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Maracas");
    }

    @Override
    public void nombrar() {
        setNombre("Maracas");
    }
    
}