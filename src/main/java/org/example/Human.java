package org.example;

/**
 * класс хранящий информацию о сущность человек
 */
public class Human {
    private int ID;
    private String name;
    private Gender gender;
    private Group group;
    private int salary;
    private String birtDate;

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setBirtDate(String birtDate) {
        this.birtDate = birtDate;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public Group getGroup() {
        return group;
    }

    public int getSalary() {
        return salary;
    }

    public String getBirtDate() {
        return birtDate;
    }

    @Override
    public String toString() {
        return "Human{" +
                "ID=" + ID +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", group=" + group +
                ", salary=" + salary +
                ", birtDate='" + birtDate + '\'' +
                "}\n";
    }
}