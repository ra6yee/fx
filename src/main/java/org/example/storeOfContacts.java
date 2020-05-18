package org.example;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.example.interfaces.action;

import java.util.ArrayList;
import java.util.List;

public class storeOfContacts implements action {
    private ObservableList <Person>personList = FXCollections.observableArrayList();

    @Override
    public void add(Person person) {
        personList.add(person);
    }

    @Override
    public void del(Person person) {
        personList.remove(person);
    }

    @Override
    public void edit(Person person) {

    }

    public ObservableList<Person> getPersonList() {
        return personList;
    }

    public void print() {
        for (Person person : personList) {
            System.out.println("имя " + person.getName() + " " + "номер телефона: " + person.getNumber());

        }

    }
}