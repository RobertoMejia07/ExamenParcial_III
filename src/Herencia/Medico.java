/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author rober
 */
public class Medico extends Persona{
    private String especialidadRM;
    private int aniosExperienciaRM;

    public Medico(String especialidadRM, int aniosExperienciaRM, String nombreRM, int edadRM, String direccionRM) {
        super(nombreRM, edadRM, direccionRM);
        this.especialidadRM = especialidadRM;
        this.aniosExperienciaRM = aniosExperienciaRM;
    }

    public String getEspecialidadRM() {
        return especialidadRM;
    }

    public void setEspecialidadRM(String especialidadRM) {
        this.especialidadRM = especialidadRM;
    }

    public int getAniosExperienciaRM() {
        return aniosExperienciaRM;
    }

    public void setAniosExperienciaRM(int aniosExperienciaRM) {
        this.aniosExperienciaRM = aniosExperienciaRM;
    }

    
}