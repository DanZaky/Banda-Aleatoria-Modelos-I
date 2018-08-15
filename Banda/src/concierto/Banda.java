/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concierto;

import instrumentos.Instrumento;
import instrumentos.*;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Banda {

    private final ArrayList<Interprete> banda = new ArrayList<>();

    public ArrayList<Interprete> getBanda() {
        return banda;
    }

    public void crearBanda() {

        Random aleatorio = new Random();

        for (int i = 0; i < (aleatorio.nextInt(15) + 10); i++) {

            Interprete interprete = new Interprete();
            interprete.setMyInstrumento(darInstrumento(aleatorio.nextInt(7)));
            banda.add(interprete);
        }
    }

    public Instrumento darInstrumento(int opcion) {
        switch (opcion) {
            case 0:
                return new Guitarra();
            case 1:
                return new Flauta();
            case 2:
                return new Maracas();
            case 3:
                return new Violin();
            case 4:
                return new Bajo();
            case 5:
                return new Tambor();
            default:
                return new Trompeta();
        }
    }

}
