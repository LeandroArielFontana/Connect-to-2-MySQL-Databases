package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.example.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

/*  La clase JdbcTemplate en Spring Framework es la encargada de realizar el trabajo de captura de
    excepciones, enviar consultas a la base de datos, mapear los resultados (convertir los datos de
    la tabla en la correspondiente clase), cerrar las conexiones, etc., con esto logramos reducir el
    código y nos enfocamos únicamente en lo que realmente nos interesa

    Utilizando jdbcTemplate.query ejecutamos la consulta indicada, RowMapper<T> nos permitirá mapear
    los datos obtenidos a través del ResulSet, por cada fila devuelta creamos un objeto para obtener
    al final una lista de los productos en la base de datos.*/

@Component
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    private static final String GET_ALL = "select * from user";

    public List getUsers() {
        return jdbcTemplate.query(GET_ALL, new RowMapper() {

            @Override
            public User mapRow(ResultSet rs, int rowNum) throws SQLException {
                return new User(rs.getInt(1), rs.getString(2), rs.getString(3));
            }
        });
    }
}
