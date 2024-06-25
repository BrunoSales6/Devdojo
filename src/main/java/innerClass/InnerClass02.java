package innerClass;

public class InnerClass02 {
    private  String nome= "Tiberio";
    void print(){
        class InternaMetodo{
            public void printLocal(){
                System.out.println(nome);
            }

        }
        new InternaMetodo().printLocal();
    }

    public static void main(String[] args) {

    }
}
