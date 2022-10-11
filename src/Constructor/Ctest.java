package Constructor;
/*
    *Constructors are invoked implicitly when you instantiate objects.
    *The two rules for creating a constructor are:
        -The name of the constructor should be the same as the class.
        -A Java constructor must not have a return type.
    *If a class doesn't have a constructor, the Java compiler automatically creates a default constructor during run-time.
     The default constructor initializes instance variables with default values. For example, the int variable will be initialized to 0

    *Constructor types:
        -No-Arg Constructor - a constructor that does not accept any arguments
        -Parameterized constructor - a constructor that accepts arguments
        -Default Constructor - a constructor that is automatically created by the Java compiler if it is not explicitly defined.

    *A constructor cannot be abstract or static or final.
    *A constructor can be overloaded but can not be overridden.
 */
public class Ctest {
    private String name;
    private Ctest(){
        System.out.println("Constructor Created :");
         name = "Jaspher";
    }

    public static void main(String[] args) {
        Ctest obj = new Ctest();
        Company obj02 = new Company();
        ProgLang obj03 = new ProgLang("Java");


        System.out.println(obj02.name);
        System.out.println(obj03);

    }
}
class Company {
    String name;

    public Company(){
        name = "Yellow";
    }
}

class ProgLang {
    String languages;

    ProgLang(String lang){
        languages = lang;
        System.out.println(languages + " Programming Language");
    }
}