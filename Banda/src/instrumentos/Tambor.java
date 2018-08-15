/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package instrumentos;

/**
 *
 * @author Estudiantes
 */
public class Tambor extends Instrumento{

    @Override
    public void afinar() {
        System.out.println("Alsitando Tambor");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando Tambor");
    }
    
}
