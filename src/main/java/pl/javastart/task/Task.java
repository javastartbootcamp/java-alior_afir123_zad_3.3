package pl.javastart.task;

public class Task {
    private String name;
    private String description;
    private int priority;
    private Person person;

    public Task(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Task(String name, String description, int priority) {
        this(name, description);
        this.priority = priority;
    }

    public Task(String name, String description, int priority, Person person) {
        this(name, description, priority);
        this.person = person;
    }

    public boolean highPriority() {
        return priority > 0;
    }

    public boolean mediumPriority() {
        return priority == 0;
    }

    public boolean lowPriority() {
        return priority < 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
