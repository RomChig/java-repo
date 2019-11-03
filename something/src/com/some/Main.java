package com.some;

import java.beans.PropertyEditorManager;
import java.util.Scanner;
import com.some.*;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.getName();
        person.setName("Roma", 20);
        System.out.println(person.getName() + ":" + person.getAge() + " лет");
    }
}

