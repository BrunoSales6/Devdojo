package jdbc.repository;

import com.mysql.cj.protocol.Resultset;
import jdbc.conn.ConnectionFactory;
import jdbc.dominio.Producer;
import lombok.extern.log4j.Log4j2;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

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
//////////////////////////////////////
    public static List<Producer> findAll(){
        log.info("Finding all producers...");
        String sql="SELECT id, name FROM anime_store.producer;";
        List<Producer> producers= new ArrayList<>();
        try(Connection conn= ConnectionFactory.getConnection();
            Statement stmt= conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql)
        )
        {
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Producer producer2 = Producer.builder().id(id).name(name).build();
                producers.add(producer2);
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producers ");
            e.printStackTrace();
        }
        return producers;

    }

//////////////////////////////////////
    public static List<Producer> findByName(String name1){
        log.info("Finding all producers...");
        String sql="SELECT * FROM anime_store.producer where name like'%s';".formatted("%"+name1+"%");
        List<Producer> producers= new ArrayList<>();
        try(Connection conn= ConnectionFactory.getConnection();
            Statement stmt= conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql)
        )
        {
            while (rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Producer producer2 = Producer.builder().id(id).name(name).build();
                producers.add(producer2);
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producers ");
            e.printStackTrace();
        }
        return producers;

    }

    //////////////////////////////////////
    public static void showMetaData(){
        log.info("Showing producer metaData...");
        String sql="SELECT * FROM anime_store.producer";
        try(Connection conn= ConnectionFactory.getConnection();
            Statement stmt= conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
        )
        {
            ResultSetMetaData metaData = rs.getMetaData();
            int columnCount = metaData.getColumnCount();
            log.info("Columns count '{}',",columnCount);
            for (int i = 1; i <=columnCount ; i++) {
                log.info("Table name '{}'",metaData.getTableName(i));
                log.info("Column name '{}'",metaData.getColumnName(i));
                log.info("Column size '{}'",metaData.getColumnDisplaySize(i));
                log.info("Column type '{}'",metaData.getColumnTypeName(i));


            }


        } catch (SQLException e) {
            log.error("Error while trying to find all producers ");
            e.printStackTrace();
        }
    }
    //////////////////////////////////////

    public static void showDriverMetaData(){
        log.info("Showing Driver metaData...");
        try(Connection conn= ConnectionFactory.getConnection();
        )
        {
            DatabaseMetaData connMetaData = conn.getMetaData();
            if(connMetaData.supportsResultSetType(ResultSet.TYPE_FORWARD_ONLY)){
                log.info("Supports TYPE_FORWARD_ONLY");
                if (connMetaData.supportsResultSetConcurrency(ResultSet.TYPE_FORWARD_ONLY,ResultSet.CONCUR_UPDATABLE)){
                    log.info("And supports CONCUR_UPDATABLE ");
                }
            }
            if(connMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_INSENSITIVE)){
                log.info("Supports TYPE_SCROLL_INSENSITIVE");
                if (connMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE)){
                    log.info("And supports CONCUR_UPDATABLE ");
                }
            }
            if(connMetaData.supportsResultSetType(ResultSet.TYPE_SCROLL_SENSITIVE)){
                log.info("Supports TYPE_SCROLL_SENSITIVE");
                if (connMetaData.supportsResultSetConcurrency(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE)){
                    log.info("And supports CONCUR_UPDATABLE ");
                }
            }


        } catch (SQLException e) {
            log.error("Error while trying to find all producers ");
            e.printStackTrace();
        }
    }
    //////////////////////////////////////
    public static void showTypeScrollWorking(){
        log.info("Finding all producers...");
        String sql="SELECT * FROM anime_store.producer;";
        List<Producer> producers= new ArrayList<>();
        try(Connection conn= ConnectionFactory.getConnection();
            Statement stmt= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=stmt.executeQuery(sql)
        )
        {
            log.info("Last row: {}",rs.last());
            int id = rs.getInt("id");
            String name = rs.getString("name");
            Producer producer2 = Producer.builder().id(id).name(name).build();
            log.info(producer2);

        } catch (SQLException e) {
            log.error("Error while trying to find all producers ");
            e.printStackTrace();
        }


    }
    //////////////////////////////////////
    public static List<Producer> findByNameAndUpdateToUpperCase(String name1){
        log.info("Finding all producers...");
        String sql="SELECT * FROM anime_store.producer where name like'%s';".formatted("%"+name1+"%");
        List<Producer> producers= new ArrayList<>();
        try(Connection conn= ConnectionFactory.getConnection();
            Statement stmt= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=stmt.executeQuery(sql)
        )
        {
            while (rs.next()){
                rs.updateString("name",rs.getString("name").toUpperCase());
                rs.updateRow();
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Producer producer2 = Producer.builder().id(id).name(name).build();
                producers.add(producer2);
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producers ");
            e.printStackTrace();
        }
        return producers;

    }
    //////////////////////////////////////
    public static List<Producer> findByNameAndInsertWhenNotFound(String name1){
        log.info("Finding all producers...");
        String sql="SELECT * FROM anime_store.producer where name like'%s';".formatted("%"+name1+"%");
        List<Producer> producers= new ArrayList<>();
        try(Connection conn= ConnectionFactory.getConnection();
            Statement stmt= conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            ResultSet rs=stmt.executeQuery(sql)

        )
        {
            if(!rs.next()){
                rs.moveToInsertRow();
                rs.updateString("name",name1);
                rs.insertRow();
                rs.beforeFirst();
                rs.next();
                int id = rs.getInt("id");
                String name = rs.getString("name");
                Producer producer2 = Producer.builder().id(id).name(name).build();
                producers.add(producer2);
            }


        } catch (SQLException e) {
            log.error("Error while trying to find all producers ");
            e.printStackTrace();
        }
        return producers;

    }
    //////////////////////////////////////

    public static List<Producer> findByNamePrepared(String name) {
        log.info("Finding all producers...");
        String sql = "SELECT * FROM anime_store.producer WHERE name = ?;";
        List<Producer> producers = new ArrayList<>();
        try (Connection conn = ConnectionFactory.getConnection();
             PreparedStatement ps = createPreparedStatement(conn, sql, name);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String producerName = rs.getString("name");
                Producer producer = Producer.builder().id(id).name(producerName).build();
                producers.add(producer);
            }

        } catch (SQLException e) {
            log.error("Error while trying to find all producers", e);
        }

        return producers;
    }

    private static PreparedStatement createPreparedStatement(Connection connection, String sql, String name) throws SQLException {
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, name);
        return ps;
    }





}
