public class Person {
    private String name;

    Person(String name) {
        this.name = name;
    }

    public void print() {
        System.out.println(name);
    }

    @Override
    public String toString() {
        return name;
    }
}
