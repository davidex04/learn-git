package org.example;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {

Manager manager = new Manager();
manager.addTask("jvida");
manager.addTask("loke");

Gson gson = new Gson();
String json = gson.toJson(manager.getTasks());

        System.out.println("Task as Json: " +json);

    }
}