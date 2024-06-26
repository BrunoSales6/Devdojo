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
            log.info("Insert producer {} in database, Linhas afetadas: {}",producer.getName(),linhasafetadas);

        } catch (SQLException e) {
            log.error("Error while trying to insert producer {}", producer.getName(), e);
            e.printStackTrace();
        }

    }
//////////////////////////////
    public static void delete(int id){
        String sql="DELETE FROM `anime_store`.`producer` WHERE (`id` = '%d');".formatted(id);
        try(Connection conn= ConnectionFactory.getConnection();
            Statement stmt= conn.createStatement()


        )
        {
            int linhasafetadas=stmt.executeUpdate(sql);
            log.info("Deleted producer {} in database, Linhas afetadas: {}",id,linhasafetadas);

        } catch (SQLException e) {
            log.error("Error while trying to insert producer with this id: {}",id, e);
            e.printStackTrace();
        }

    }
////////////////////////////////////
public static void update(Producer producer){
    String sql="UPDATE `anime_store`.`producer` SET `Name` = '%s' WHERE (`id` = '%d');".formatted(producer.getName(), producer.getId());
    try(Connection conn= ConnectionFactory.getConnection();
        Statement stmt= conn.createStatement()
    )
    {
        int linhasafetadas=stmt.executeUpdate(sql);
        log.info("Update producer {} in database, Linhas afetadas: {}",producer.getId(),linhasafetadas);

    } catch (SQLException e) {
        log.error("Error while trying to Updtade producer with this id: {}",producer.getId(), e);
        e.printStackTrace();
    }

}


}
