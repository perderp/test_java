package Encapsulation;

/*
    Why Encapsulation
    *In Java, encapsulation helps us to keep related fields and methods together, which makes our code cleaner and easy to read.
    *It helps to control the values of our data fields

    *It helps to decouple components of a system. For example, we can encapsulate code into multiple bundles.
    *These decoupled components (bundle) can be developed, tested, and debugged independently and concurrently. And, any changes in a particular component do not have any effect on other components.
    *We can also achieve data hiding using encapsulation. In the above example, if we change the length and breadth variable into private,
    then the access to these fields is restricted.
    And, they are kept hidden from outer classes. This is called data hiding.

    Data hiding is a way of restricting the access of our data members by hiding the implementation details. Encapsulation also provides a way for data hiding.
 */

class Person {
    private int age;

    //getter method
    public int getAge() {
        return age;
    } // provides read-only access

    //setter method
    public void setAge(int age){
        if(age >= 0){
            this.age = age;
        }
    } // provides write-only access
}

class Main02 {
    public static void main(String[] args) {
        // create an object of Person
        Person p1 = new Person();
        // change age using setter
        p1.setAge(24);
        // access age using getter
        System.out.println("My age is : " + p1.getAge());
    }
}

/*
    In the above example, we have a private field age. Since it is private, it cannot be accessed from outside the class.
    In order to access age, we have used public methods: getAge() and setAge(). These methods are called getter and setter methods.
    Making age private allowed us to restrict unauthorized access from outside the class. This is data hiding.
    If we try to access the age field from the Main class, we will get an error.
 */