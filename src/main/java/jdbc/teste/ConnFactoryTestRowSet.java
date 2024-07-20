package jdbc.teste;

import jdbc.dominio.Producer;
import jdbc.service.ProducerServiceRowSet;
import lombok.extern.log4j.Log4j2;

import java.util.List;

@Log4j2
public class ConnFactoryTestRowSet {
    public static void main(String[] args) {
        List<Producer> name = ProducerServiceRowSet.findByNameJdbcRowSet("NHK");
        log.info(name);
    }
}
