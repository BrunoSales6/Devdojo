package exceptions;

public class Teste01 {
    public static void main(String[] args) {
        div(5,1);

        System.out.println(div(5,0));
        System.out.println(div(5,1));


    }
    private static int div(int a, int b){
        if(b==0){
            throw new IllegalArgumentException("b não pode ser 0");
        }
        return a/b;
    }
}
