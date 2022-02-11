package edu.unbosque.opencsvtutorial;

import com.opencsv.bean.CsvBindByName;

public class PersonBean {

    @CsvBindByName(column = "name")
    private String name;

    @CsvBindByName(column = "age")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}
