package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * класс предназначенный для хранения списка сущность human
 */
public class HumanList {
    ArrayList<Human> list;

    public HumanList() {
        list = new ArrayList<>();
    }

    /**
     * метод для заполнения list
     * @param fileName - файл, с которого считывается информация
     * @throws IOException - ошибки, возникающие в процессе обработки файла
     */
    public void fileGetInfo(String fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName + ".csv"));
        String line;
        boolean flagSkipFirst = true;           // флаг необходимый для пропуска первой строки
        while ((line = reader.readLine()) != null) {
            if (flagSkipFirst) {
                flagSkipFirst = false;
            } else {
                String[] parseInfo = line.split(";");
                Human hum = new Human();

                hum.setID(Integer.parseInt(parseInfo[0]));
                hum.setName(parseInfo[1]);
                if (parseInfo[2].equals("Female")) {
                    hum.setGender(Gender.FEMALE);
                } else {
                    hum.setGender(Gender.MALE);
                }
                hum.setBirtDate(parseInfo[3]);
                hum.setGroup(new Group(hum.getID() - 20, parseInfo[4]));
                hum.setSalary(Integer.parseInt(parseInfo[5]));

                list.addLast(hum);
            }
        }
        reader.close();
    }

    @Override
    public String toString() {
        return "HumanList{" +
                "list=" + list +
                '}';
    }
}