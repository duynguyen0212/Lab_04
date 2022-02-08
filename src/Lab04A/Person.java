package Lab04A;
import java.util.Comparator;
public class Person {
    public String name;
    public int age;

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

}
