import java.util.Objects;

public class Book {
    private String title;
    private Author author;
    private int year;

    Book(String title, String authorFirstName, String authorLastName, int year) {
        this.title = title;
        this.author = new Author(authorFirstName, authorLastName);
        this.year = year;
    }

    public String getTitle() {
        return title;
    }


    public Author getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }
    public String toString() {
        return title + " by " + author.getFirstName() + " " + author.getLastName();
    }

    public boolean equals(Book book) {
        if (this.getTitle() != book.getTitle() && this.getAuthor() != book.getAuthor() && this.getYear() != book.getYear()) {
            return false;
        } else {
            return true;
        }
    }
    @Override
    public int hashCode() {
        return Objects.hash(author);
    }
}
