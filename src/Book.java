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


    public String getAuthor() {
        return author.getFirstName() + " " + author.getLastName();
    }
    public int getYear() {
        return year;
    }


    public void setYear(int year) {
        this.year = year;
    }

}
