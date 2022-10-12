package Polymorphism;

class ProgrammingLanguage {
    public void display() {
        System.out.println("I am Programming Language.");
    }
}

class Java02 extends ProgrammingLanguage {
    @Override
    public void display() {
        System.out.println("I am Object-Oriented Programming Language.");
    }
}

class Main04 {
    public static void main(String[] args) {

        // declare an object variable
        ProgrammingLanguage pl;

        // create object of ProgrammingLanguage
        pl = new ProgrammingLanguage();
        pl.display();

        // create object of Java class
        pl = new Java02();
        pl.display();
    }
}

/*
    *In the above example, we have created an object variable pl of the ProgrammingLanguage class. Here, pl is a polymorphic variable. This is because,
     -In statement pl = new ProgrammingLanguage(), pl refer to the object of the ProgrammingLanguage class.
     -And, in statement pl = new Java(), pl refer to the object of the Java class.
 */