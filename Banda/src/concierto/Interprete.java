/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concierto;

/**
 *
 * @author Estudiantes
 */
public class Interprete {
    
    private Instrumento obj_Instrumento;
    private final String id;

    public Interprete(String id) {
        this.id = id;
    }

    public void setMyInstrumento(Instrumento obj_Instrumento) {
        this.obj_Instrumento = obj_Instrumento;
    }
    
    public void nombrarInstrumento(Instrumento obj_Instrumento) {
        obj_Instrumento.nombrar();
        System.out.println("* instrumento: " + obj_Instrumento.getNombre());
    }

    public void afinarInstrumento(Instrumento obj_Instrumento) {
        obj_Instrumento.afinar();
    }

    public void tocarInstrumento(Instrumento obj_Instrumento) {
        obj_Instrumento.tocar();
    }

    public void mostrarInterprete(int i) {
        System.out.println("\nInterprete N° " + i);
        System.out.println("* id del interprete: " + id);
        nombrarInstrumento(obj_Instrumento);
        afinarInstrumento(obj_Instrumento);
        tocarInstrumento(obj_Instrumento);
    }
    
}
