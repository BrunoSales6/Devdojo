package parametizando.dominio;

public class Car {
    private String nome;
    private int year;
    private String color;

    public Car(String nome, int year, String color) {
        this.nome = nome;
        this.year = year;
        this.color = color;
    }

    public String getNome() {
        return nome;
    }

    public int getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "nome='" + nome + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                '}';
    }

    public String getColor() {
        return color;
    }
}
