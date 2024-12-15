/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author rober
 */
public class Paciente extends Persona{
    private int nroHistorialRM;
    private String EnfermedadRM;

    public Paciente(int nroHistorialRM, String EnfermedadRM, String nombreRM, int edadRM, String direccionRM) {
        super(nombreRM, edadRM, direccionRM);
        this.nroHistorialRM = nroHistorialRM;
        this.EnfermedadRM = EnfermedadRM;
    }

    public int getNroHistorialRM() {
        return nroHistorialRM;
    }

    public void setNroHistorialRM(int nroHistorialRM) {
        this.nroHistorialRM = nroHistorialRM;
    }

    public String getEnfermedadRM() {
        return EnfermedadRM;
    }

    public void setEnfermedadRM(String EnfermedadRM) {
        this.EnfermedadRM = EnfermedadRM;
    }

    
}