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
public class Profesor {

    private int id_profesor;
    private String nombre_profesor;
    private String descripcion_profesor;
    private String contacto_profesor;
    private String usuario_profesor;
    private String password_profesor;
    private int id_curso;

    public Profesor(int id_profesor, String nombre_profesor, String descripcion_profesor, String contacto_profesor, String usuario_profesor, String password_profesor, int id_curso) {
        this.id_profesor = id_profesor;
        this.nombre_profesor = nombre_profesor;
        this.descripcion_profesor = descripcion_profesor;
        this.contacto_profesor = contacto_profesor;
        this.usuario_profesor = usuario_profesor;
        this.password_profesor = password_profesor;
        this.id_curso = id_curso;
    }

    public Profesor() {
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
    }

    public String getNombre_profesor() {
        return nombre_profesor;
    }

    public void setNombre_profesor(String nombre_profesor) {
        this.nombre_profesor = nombre_profesor;
    }

    public String getDescripcion_profesor() {
        return descripcion_profesor;
    }

    public void setDescripcion_profesor(String descripcion_profesor) {
        this.descripcion_profesor = descripcion_profesor;
    }

    public String getContacto_profesor() {
        return contacto_profesor;
    }

    public void setContacto_profesor(String contacto_profesor) {
        this.contacto_profesor = contacto_profesor;
    }

    public String getUsuario_profesor() {
        return usuario_profesor;
    }

    public void setUsuario_profesor(String usuario_profesor) {
        this.usuario_profesor = usuario_profesor;
    }

    public String getPassword_profesor() {
        return password_profesor;
    }

    public void setPassword_profesor(String password_profesor) {
        this.password_profesor = password_profesor;
    }

    public int getId_curso() {
        return id_curso;
    }

    public void setId_curso(int id_curso) {
        this.id_curso = id_curso;
    }

}
