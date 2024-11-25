package model;

public class Student {
    private int id;
    private String name;
    private boolean[] tasks = new boolean[3];  // 3 задачи

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Метод для получения имени
    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public boolean[] getTasks() {
        return tasks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTasks(boolean[] tasks) {
        this.tasks = tasks;
    }
}
