/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author anfeg
 */
public class Estudiante {

    private int id_estudiante;
    private String nombre_estudiante;
    private String contacto_estudiante;
    private int id_curso;

    public Estudiante(int id_estudiante, String nombre_estudiante, String contacto_estudiante, int id_curso) {
        this.id_estudiante = id_estudiante;
        this.nombre_estudiante = nombre_estudiante;
        this.contacto_estudiante = contacto_estudiante;
        this.id_curso = id_curso;
    }

    public Estudiante() {
    }

    public int getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(int id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

    public String getNombre_estudiante() {
        return nombre_estudiante;
    }

    public void setNombre_estudiante(String nombre_estudiante) {
        this.nombre_estudiante = nombre_estudiante;
    }

    public String getContacto_estudiante() {
        return contacto_estudiante;
    }

    public void setContacto_estudiante(String contacto_estudiante) {
        this.contacto_estudiante = contacto_estudiante;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

}
