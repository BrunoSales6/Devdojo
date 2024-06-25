package innerClass;
class Animal{
    public void walk(){
        System.out.println("Animal Walking");
    }
}

public class ClassesAnônimas {
    public static void main(String[] args) {
        Animal animal= new Animal(){
            @Override
            public void walk() {
                System.out.println("Animal walking anonymus");
            }
        };

        animal.walk();

    }
}
