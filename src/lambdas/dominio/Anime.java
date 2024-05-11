package lambdas.dominio;

public class Anime {
    private String title;
    private  Integer quantity;

    public Anime(String title, Integer quantity) {
        this.title = title;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "title='" + title + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
