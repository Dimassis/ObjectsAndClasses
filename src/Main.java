public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("L.N", "Tolstoy");
        Author author2 = new Author("A.S", "Pushkin");
        Book book1 = new Book("War and Peace", author1.getFirstName(),author1.getLastName(), 1867);
        Book book2 = new Book("Captain's daughter", author2.getFirstName(),author2.getLastName(), 1836);
        System.out.println("title: " + book1.getTitle() + ", Author: " + book1.getAuthor() + ", year: " + book1.getYear());
        System.out.println("title: " + book2.getTitle() + ", Author: " + book2.getAuthor() + ", year: " + book2.getYear());
        book1.setYear(2020);
        System.out.println("title: " + book1.getTitle() + ", Author: " + book1.getAuthor() + ", year: " + book1.getYear());
        System.out.println(book1.toString());
        System.out.println(book1.hashCode());
        System.out.println(book2.equals(book1));
    }
}