/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Model.Curso;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import util.DbUtil;

/**
 *
 * @author anfeg
 */
public class CursoDAO {
     private Connection connection;

    public CursoDAO() throws SQLException, URISyntaxException {
        connection = DbUtil.getConnection();
    }
    
     public ArrayList<Curso> getAsistenciaID(int a) throws SQLException, URISyntaxException {
        ArrayList<Curso> curso = null;
        boolean result = false;
        String query = "SELECT * FROM curso where id_curso= " + a;
        Connection connection = DbUtil.getConnection();
        try {

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            int id_curso = 0;
            String nombre_curso = null;
            
        
           
            while (rs.next()) {
                if (curso == null) {
                    curso = new ArrayList<Curso>();
                }
                Curso registro = new  Curso(id_curso, nombre_curso);
                
       
                
                id_curso = rs.getInt("id_curso");
                registro.setId_curso(id_curso);            

                nombre_curso = rs.getString("nombre_curso");
                registro.setNombre_curso(nombre_curso);

            

            }
            if (curso != null) {
                for (int i = 0; i < curso.size(); i++) {
                    System.out.println(curso.get(i).getId_curso()+ " " + curso.get(i).getNombre_curso());
                }
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de Profesores");
            e.printStackTrace();
        }

        return curso;

    }
    
}
