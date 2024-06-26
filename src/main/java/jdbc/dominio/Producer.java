package jdbc.dominio;

import lombok.Builder;
import lombok.Value;

import java.util.Objects;
@Builder
@Value
public class Producer {
    private Integer id;
    private String name;



}
