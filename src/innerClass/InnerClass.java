package innerClass;

public class InnerClass  {
    private String name= "Bruno";
//nested classes
    class Interna{
        public void printOuterClassAtributte(){
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        InnerClass innerClass= new InnerClass();
        Interna interna = innerClass.new Interna();
        interna.printOuterClassAtributte();

    }

}
