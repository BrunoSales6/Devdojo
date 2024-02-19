package regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegularez {
    public static void main(String[] args) {
        //Bom pra achar padrão e validações
        String regx="Bruno";
        String texto="Bruno está evoluindo";
        Pattern pattern=Pattern.compile(regx);
        Matcher matcher=pattern.matcher(texto);
        while(matcher.find()){
            System.out.println(matcher.start());
        }

    }
}
