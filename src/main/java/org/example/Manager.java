package org.example;

import java.util.List;
import java.util.ArrayList;

public class Manager {
    public List<Task>tasks = new ArrayList<>();

    public void addTask(String name){
        tasks.add(new Task(name));
    }
    public List<Task> getTasks(){
        return tasks;
    }
    public int size(){
        return tasks.size();
    }
}
