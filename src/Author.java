import java.util.Objects;

public class Author {
    private String firstName;
    private String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String toString() {
        return firstName + " " + lastName;
    }
    public boolean equals(Author author) {
        if(this.firstName.equals(author.getFirstName()) && this.lastName.equals(author.getLastName())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
