package jdbc.repository;

import jdbc.conn.ConnectionFactory;
import jdbc.dominio.Producer;

import javax.sql.rowset.JdbcRowSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProducerRepositoryRowSet {
    public static List<Producer>findByNameJdbcRowSet(String name){
        String sql="SELECT * FROM anime_store.producer where name like ?;";
        List<Producer> producers= new ArrayList<>();
        try (JdbcRowSet jrs = ConnectionFactory.getJdbcRowSet()) {
            jrs.setCommand(sql);
            jrs.setString(1,String.format("%%%s%%",name));
            jrs.execute();
            while (jrs.next()){
                Producer producer = Producer.builder()
                        .id(jrs.getInt("id"))
                        .name(jrs.getString("name"))
                        .build();
                producers.add(producer);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return producers;

    }
}
