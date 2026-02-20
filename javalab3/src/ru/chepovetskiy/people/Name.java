package ru.chepovetskiy.people;

// Задание 1.7
public class Name {
    private final String surname;
    private final String name;
    private final String patronymic;

    public Name(String surname, String name, String patronymic) {
        if ((surname == null || surname.isEmpty()) &&
                (name == null || name.isEmpty()) &&
                (patronymic == null || patronymic.isEmpty())) {
            throw new IllegalArgumentException("Ошибка: Хотя бы одно поле в имени должно быть заполнено!");
        }
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }

    @Override
    public String toString() {
        String res = "";
        if (surname != null && !surname.isEmpty()) res += surname + " ";
        if (name != null && !name.isEmpty()) res += name + " ";
        if (patronymic != null && !patronymic.isEmpty()) res += patronymic;
        return res.trim();
    }
}