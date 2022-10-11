package Person;

public class Person {
    private String name;
    private int age;
    private final static String city = "Philippines";



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public static String getCity() {
        return city;
    }


    @Override
    public String toString() {
        return "Person.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city= '" + city + '\'' +
                '}';
    }
}
