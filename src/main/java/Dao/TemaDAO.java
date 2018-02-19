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
import Model.Tema;
import util.DbUtil;

/**
 *
 * @author Gibran
 */
public class TemaDAO {

    private Connection connection;

    public TemaDAO() throws SQLException, URISyntaxException {
        connection = DbUtil.getConnection();
    }

    public ArrayList<Tema> getAsistenciaID(int a) throws SQLException, URISyntaxException {
        ArrayList<Tema> tema = null;
        boolean result = false;
        String query = "SELECT * FROM tema where id_tema= " + a;
        Connection connection = DbUtil.getConnection();
        try {

            Statement st = connection.createStatement();
            ResultSet rs = st.executeQuery(query);

            int id_tema = 0;
            String nombre_tema = null;

            while (rs.next()) {
                if (tema == null) {
                    tema = new ArrayList<Tema>();
                }
                Tema registro = new Tema(id_tema, nombre_tema);

                id_tema = rs.getInt("id_tema");
                registro.setId_tema(id_tema);

                nombre_tema = rs.getString("nombre_tema");
                registro.setNombre_tema(nombre_tema);

                tema.add(registro);

            }
            if (tema != null) {
                for (int i = 0; i < tema.size(); i++) {
                    System.out.println(tema.get(i).getId_tema() + " " + tema.get(i).getNombre_tema());
                }
            }
            st.close();

        } catch (SQLException e) {
            System.out.println("Problemas al obtener la lista de notas");
            e.printStackTrace();
        }

        return tema;

    }

}
