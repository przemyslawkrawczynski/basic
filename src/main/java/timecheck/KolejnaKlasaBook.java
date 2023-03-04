package timecheck;

public class KolejnaKlasaBook {

    String author;
    String title;

    public KolejnaKlasaBook(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public int hashCode() {
        return this.author.hashCode() + this.title.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        KolejnaKlasaBook e = (KolejnaKlasaBook) o;
        return this.author.equals(e.author) && this.title.equals(e.title);

    }
}

