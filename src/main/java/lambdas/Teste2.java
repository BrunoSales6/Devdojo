//package lambdas;
//
//import parametizando.dominio.Car;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import static parametizando.teste.Teste.cars;
//
//public class Teste2 {
//    private static List<Car> filter(List<Car> cars,Explicacao explicacao){
//        List<Car2> filterCars=new ArrayList<>();
//        for(Car car:cars){
//            if (explicacao.teste(car)){
//                filterCars.add(car);
//            }
//        }
//        return filterCars;
//    }
//
//    private static List<Car> filterByAge(List<Car> cars, int year){
//        List<Car> newCars= new ArrayList<>();
//        for(Car car: cars){
//            if(car.getYear()>year){
//                newCars.add(car);
//            }
//        }
//        return newCars;
//
//    }
//    private static List<Car2> car= List.of(new Car("Audi",2024,"Azul"),new Car("Ferrari",2024,"Vermelho"));
//
//    public static void main(String[] args) {
//        List<Car2> greenCars= filter(car,car -> car.getColor().equals("Azul"));
//
//
//    }
//
//}
//
//

