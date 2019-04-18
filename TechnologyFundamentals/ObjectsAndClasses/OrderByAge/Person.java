package ObjectsAndClasses.OrderByAge;

public class Person {
    private String name;
    private String id;
    private Integer age;

    public Person(String name, String id, Integer age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s with ID: %s is %d years old.",
                this.getName(), this.getId(), this.getAge());
    }
}
