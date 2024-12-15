/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Herencia;

/**
 *
 * @author rober
 */
public class Persona {
    private String nombreRM;
    private int edadRM;
    private String direccionRM;

    public Persona(String nombreRM, int edadRM, String direccionRM) {
        this.nombreRM = nombreRM;
        this.edadRM = edadRM;
        this.direccionRM = direccionRM;
    }

    public String getNombreRM() {
        return nombreRM;
    }

    public void setNombreRM(String nombreRM) {
        this.nombreRM = nombreRM;
    }

    public int getEdadRM() {
        return edadRM;
    }

    public void setEdadRM(int edadRM) {
        this.edadRM = edadRM;
    }

    public String getDireccionRM() {
        return direccionRM;
    }

    public void setDireccionRM(String direccionRM) {
        this.direccionRM = direccionRM;
    }

}
    