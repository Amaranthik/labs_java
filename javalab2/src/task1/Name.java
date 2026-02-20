package task1;

public class Name {
    private String surname;
    private String personalName;
    private String patronymic;

    public Name(String surname, String personalName, String patronymic) {
        this.surname = surname;
        this.personalName = personalName;
        this.patronymic = patronymic;
    }
    // геттеры для задания 2
    public String getSurname() {
        return surname;
    }

    public String getPersonalName() {
        return personalName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String toString() {
        String result = "";
        if (surname != null) {
            result += surname + " ";
        }
        if (personalName != null) {
            result += personalName + " ";
        }
        if (patronymic != null) {
            result += patronymic;
        }
        return result.trim();
    }
}