package exceptions;

public class Teste02 {
    public static void main(String[] args) {
        try{
            System.out.println("Abrindo arquibo");
            System.out.println("Escrevendo no arquivo");
        }
        catch (Exception e){
            System.out.println("Fechando SO");
            e.printStackTrace();
        }finally {
            System.out.println("Fechando SO");
        }
    }
}
