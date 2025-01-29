package ru.aston.Beilov_DR.task1;

import java.time.LocalDate;
import java.util.Date;

public class q5_House {

    private int flores;
    private int dateOfConstruction;
    private String name;

    private boolean isDateOfConstructionInited;


    public void setAllData(String name, int dateOfConstruction, int flores) {
        this.flores = flores;
        this.dateOfConstruction = dateOfConstruction;
        this.name = name;
    }

    public void printAllData() {
        System.out.println(toString());
    }

    public int yearsFromConstruction() {
        if (isDateOfConstructionInited) throw new RuntimeException("Date of construction isn't initialized");
        return  LocalDate.now().getYear() - dateOfConstruction;
    }

    @Override
    public String toString() {
        return "Name: " + name + " dateOfConstruction: " + dateOfConstruction + " flores: " + flores;
    }

    public static void main(String[] args) {

        q5_House h = new q5_House();
        h.printAllData();
        //System.out.println(h.yearsFromConstruction());
        // to avoid gettng incorrect data when Default-initialized it throw an exeption

        h.setAllData("566 Baker Street house", 1986, 9);
        h.printAllData();
        System.out.println(h.yearsFromConstruction() + " years from construction");
    }
}

/*5. Создайте класс Дом. Добавьте в него следующие данные:
    • поля: количество этажей, год постройки, наименование;
    • метод для установки всех значений;
    • метод для вывода всех значений;
    • метод, возвращающий количество лет с момента постройки.

На основе класса создайте два объекта и пропишите для каждого характеристики.
Добавление характеристик реализуйте через метод класса.

Выведите информацию про каждый объект.
*/