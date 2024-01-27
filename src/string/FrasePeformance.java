package string;

public class FrasePeformance {
    public static void main(String[] args) {
        long inicio=System.currentTimeMillis();
        concatString(10000);
        long fim=System.currentTimeMillis();
        System.out.println("O tempo gasto pela String foi:"+(fim-inicio));

        long inicio2=System.currentTimeMillis();
        juntasb(1000000);
        long fim2=System.currentTimeMillis();
        System.out.println("O tempo gasto pelo sb foi:"+(fim2-inicio2));

        long inicio3=System.currentTimeMillis();
        juntasf(1000000);
        long fim3=System.currentTimeMillis();
        System.out.println("O tempo gasto pelo sf foi:"+(fim3-inicio3));

    }
    private static void concatString(int tamanho){
        String texto="";
        for (int i = 0; i < tamanho; i++) {
            texto+=i;

        }
    }

    private static void juntasb(int tamnaho){
        StringBuilder texto=new StringBuilder(tamnaho);
        for (int i = 0; i <tamnaho ; i++) {
            texto.append(i);

        }

    }
    private static  void juntasf(int tamanho){
        StringBuffer texto= new StringBuffer(tamanho);
        for (int i = 0; i <tamanho ; i++) {
            texto.append(i);

        }

    }
}
