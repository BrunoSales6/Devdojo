package innerClass;

public class InnerStatic {
    private String name= "Bruno";

    static class Nested{
        void print(){
            System.out.println(new InnerStatic().name);
        }
    }
    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();


    }
}
