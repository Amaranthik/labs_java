package task4;

public class Person {
    private Name name;
    private int height;
    private Person father;

    public Person(String firstName, int height) {
        this(new Name(firstName), height, null);
    }

    public Person(String firstName, int height, Person father) {
        this(new Name(firstName), height, father);
    }

    public Person(Name name, int height) {
        this(name, height, null);
    }

    public Person(Name name, int height, Person father) {
        this.name = name;
        this.height = height;
        this.father = father;

        if (father != null) {
            if (this.name.getLastName() == null) {
                this.name = new Name(this.name.getFirstName(), father.name.getLastName(), this.name.getPatronymic());
            }
            if (this.name.getPatronymic() == null) {
                String newPatronymic = father.name.getFirstName() + "ович";
                this.name = new Name(this.name.getFirstName(), this.name.getLastName(), newPatronymic);
            }
        }
    }

    public String toString() {
        return name.toString() + ", " + height;
    }
}