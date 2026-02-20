package task4;

public class Name {
    private String firstName;
    private String lastName;
    private String patronymic;

    public Name(String firstName) {
        this.firstName = firstName;
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Name(String firstName, String lastName, String patronymic) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.patronymic = patronymic;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String toString() {
        String res = "";
        if (lastName != null) {
            res += lastName + " ";
        }
        if (firstName != null) {
            res += firstName + " ";
        }
        if (patronymic != null) {
            res += patronymic;
        }
        return res.trim();
    }
}