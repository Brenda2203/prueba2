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
import Model.Observador;
import util.DbUtil;

/**
 *
 * @author Gibran
 */
public class ObservadorDAO {

    private Connection connection;

    public ObservadorDAO() throws SQLException, URISyntaxException {
        connection = DbUtil.getConnection();
    }

    public ArrayList<Observador> getAsistenciaID(int a) throws SQLException, URISyntaxException {
        ArrayList<Observador> observador = null;
        boolean result = false;
        String query = "SELECT * FROM observador where id_profesor= " + a;
        Connection connection = DbUtil.getConnection();
        try {

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            int id_estudiante = 0;
            int id_profesor = 0;
            String detalles = null;
            String calificacion = null;

            while (rs.next()) {
                if (observador == null) {
                    observador = new ArrayList<Observador>();
                }
                Observador registro = new Observador(id_estudiante, id_profesor, detalles, calificacion);

                id_estudiante = rs.getInt("id_estudiante");
                registro.setId_estudiante(id_estudiante);

                id_profesor = rs.getInt("id_profesor");
                registro.setId_profesor(id_profesor);

                detalles = rs.getString("detalles");
                registro.setDetalles(detalles);

                calificacion = rs.getString("calificacion");
                registro.setDetalles(detalles);

                observador.add(registro);

            }
            if (observador != null) {
                for (int i = 0; i < observador.size(); i++) {
                    System.out.println(observador.get(i).getId_estudiante() + " " + observador.get(i).getId_profesor() + " " + observador.get(i).getDetalles() + " " + observador.get(i).getCalificaciones());
                }
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de observador");
            e.printStackTrace();
        }

        return observador;

    }

}
