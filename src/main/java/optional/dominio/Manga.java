package optional.dominio;

public class Manga {
    private Integer id;
    private String Title;

    private int chapters;

    @Override
    public String toString() {
        return "Manga{" +
                "id=" + id +
                ", Title='" + Title + '\'' +
                ", chapters=" + chapters +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getChapters() {
        return chapters;
    }

    public void setChapters(int chapters) {
        this.chapters = chapters;
    }

    public Manga(Integer id, String title, int chapters) {
        this.id = id;
        Title = title;
        this.chapters = chapters;
    }
}
