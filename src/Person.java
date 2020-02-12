public class Person {
    private String name;
    private int id;
    private static int nextid = 1;

    public Person(String name) {
        this.name = name;
        this.id = nextid;
        nextid++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
