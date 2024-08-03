import javax.swing.*;

public class Book {
    private String title;
    private String authorFirstName;
    private String authorLastName;
    private String author;
    private int year;

    Book(String title, String authorFirstName, String authorLastName, int year) {
        this.title = title;
        this.author = authorLastName + " " + authorFirstName;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }


    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = authorFirstName + " " + authorLastName;
    }

    public void setYear(int year) {
        this.year = year;
    }

}
