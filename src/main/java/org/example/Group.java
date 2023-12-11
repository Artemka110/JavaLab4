package org.example;

/**
 * класс хранящий информацию о сущности группа
 */
public class Group {
    private int ID;
    private String name;

    public Group(int ID, String name) {
        if (name.isEmpty()) {
            this.name = "";
        }
        else
            this.name = name;

        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Group{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                '}';
    }
}
