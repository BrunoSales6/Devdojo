package parametizando.teste;

import parametizando.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class Teste {
    private static List<Car> filterbyColor(List<Car> cars, String color){
        List<Car> filterCars=new ArrayList<>();
        for(Car car:cars){
            if (car.getColor().equals(color)){
                filterCars.add(car);
            }
        }
        return filterCars;
    }

    private static List<Car> filterByAge(List<Car> cars, int year){
        List<Car> newCars= new ArrayList<>();
        for(Car car: cars){
            if(car.getYear()>year){
                newCars.add(car);
            }
        }
        return newCars;

    }
    private static List<Car> cars= List.of(new Car("Audi",2024,"Azul"),new Car("Ferrari",2024,"Vermelho"));
    public static void main(String[] args) {
        System.out.println(filterbyColor(cars,"Vermelho"));
        System.out.println(filterByAge(cars,2020));

    }

}



