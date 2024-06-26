package jdbc.repository;

import jdbc.conn.ConnectionFactory;
import jdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
@Log4j2


public class ProducerRepository {

    public static void save(Producer producer){
        String sql="INSERT INTO `anime_store`.`producer` (`Name`) VALUES ('%s');".formatted(producer.getName());
        try(Connection conn= ConnectionFactory.getConnection();
            Statement stmt= conn.createStatement()


        )
        {
            int linhasafetadas=stmt.executeUpdate(sql);
            log.info("Linhas afetadas: {}",linhasafetadas);

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
