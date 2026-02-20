package task2;

import task1.Name;

public class Person {
    private Name name;
    private int height;
    private Person father;

    public Person(Name name, int height) {
        this.name = name;
        this.height = height;
    }

    public Person(Name name, int height, Person father) {
        this.name = name;
        this.height = height;
        this.father = father;
    }

    public String toString() {
        String surnameToPrint = name.getSurname();
        if (surnameToPrint == null && father != null) {
            surnameToPrint = father.name.getSurname();
        }

        String nameToPrint = name.getPersonalName();

        String patronymicToPrint = name.getPatronymic();
        if (patronymicToPrint == null && father != null) {
            patronymicToPrint = father.name.getPersonalName() + "ович";
        }

        String fullName = "";
        if (surnameToPrint != null) {
            fullName += surnameToPrint + " ";
        }
        if (nameToPrint != null) {
            fullName += nameToPrint + " ";
        }
        if (patronymicToPrint != null) {
            fullName += patronymicToPrint;
        }

        return fullName.trim() + ", рост: " + height;
    }
}