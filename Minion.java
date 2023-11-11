import java.util.Objects;

class Minion {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Minion minion = (Minion) o;
        return age == minion.age && Objects.equals(name, minion.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public Minion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Minion{name='" + name + "', age=" + age + '}';
    }
}