package colecoes;

public class TesteCelualr {
    public static void main(String[] args) {
        Celular celular=new Celular("Iphone","1234");
        Celular celular2=new Celular("IphoneX","1234");
        System.out.println(celular2.equals(celular));
    }
}
