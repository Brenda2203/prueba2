/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Model.Nota;
import util.DbUtil;


/**
 *
 * @author Gibran
 */
public class NotaDAO {
    
    private Connection connection;

    public NotaDAO() throws SQLException, URISyntaxException {
        connection = DbUtil.getConnection();
    }
    
    public ArrayList<Nota> getAsistenciaID(int a) throws SQLException, URISyntaxException {
        ArrayList<Nota> notas = null;
        boolean result = false;
        String query = "SELECT * FROM nota where id_estudiante = " + a;
        Connection connection = DbUtil.getConnection();
        try {

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            int id_estudiante = 0;
            int id_tema = 0;
            int nota = 0;
           
        
           
            while (rs.next()) {
                if (notas == null) {
                    notas = new ArrayList<Nota>();
                }
                Nota registro = new  Nota(nota, id_tema, id_estudiante);
                
                id_estudiante = rs.getInt("id_estudiante");
                registro.setId_estudiante(id_estudiante);
                
                id_tema = rs.getInt("id_tema");
                registro.setId_tema(id_tema);

                nota = rs.getInt("nota");
                registro.setNota(nota);

              

                notas.add(registro);

            }
            if (notas != null) {
                for (int i = 0; i < notas.size(); i++) {
                    System.out.println(notas.get(i).getId_estudiante()+ " " + notas.get(i).getId_tema()+ " " + notas.get(i).getNota());
                }
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de notas");
            e.printStackTrace();
        }

        return notas;

    }
    
}
