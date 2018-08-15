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
public class Flauta extends Instrumento{

    @Override
    public void afinar() {
        System.out.println("Limpiando Flauta");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Flauta");
    }

    @Override
    public void nombrar() {
        setNombre("Flauta");
    }
    
}
