package day170901.equalsandhashcode;

public class Animal {
    private int id;
    private String name;
    private int age;

    public Animal(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof Animal)) {
            return false;
        }

        Animal other = (Animal) obj;

        return id == other.id
                && age == other.age
                && name.equals(other.name);

    }

    @Override
    public int hashCode() {
        int hashcode = 7;
        hashcode = hashcode + 31 * name.hashCode();
        hashcode = hashcode + 31 * id;
        hashcode = hashcode + 31 * age;

        return hashcode;
    }
}
