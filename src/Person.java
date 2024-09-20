
import java.util.Objects;

class Person {

    private int age;
    private String city;
    private String name;
    private boolean elgible;

    public Person(int age) {
        this.age = age;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public boolean isElgible() {

        if (this.age >= 18) {
            this.elgible = true;
        }

        return elgible;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCity() {
        return this.city;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        return this.name.equals(((Person) obj).name);
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.name);
        return hash;
    }

}
