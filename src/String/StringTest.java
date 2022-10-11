package String;

public class StringTest {
    public static void main(String[] args) {
        String greet = "Hello World";
        System.out.println(greet);

        //Get the length of the String greet;
        int length = greet.length();
        System.out.println(length);


        //JOIN TWO STRINGS
        String first = "Java ";
        String second = "Programming";

        String joinedString = first.concat(second);
        System.out.println(joinedString);


        // Compare Two Strings
        String compare01 = "java";
        String compare02 = "java";// compare01;
        String compare03 = "javascript";

        boolean result1 = compare01.equals(compare02);
        System.out.println("String first and second are equal : " + result1);

        boolean result2 = compare02.equals(compare03);
        System.out.println("String second and third are equal : " + result2);

        //USING == Operator
        String name01 = new String("Java");
        String name02 = new String("Java");
        String name03 = name02;
        boolean result01 = (name01 == name02);
        boolean result02 = name01.equals(name02);
        boolean result03 = (name02 == name03);
        boolean result04 = name02.equals(name03);
        System.out.println("Using == operator : "+ result01 + " and using equals : " + result02);
        System.out.println("(name03 = name02) Using == Operator : -> " + result03 + " Using equals() :  -> " + result04);


        //Escape Character in strings

        String examples = "This is the \"String\" class.";
        System.out.println(examples);

        // Strings are immutable but in order to combine it use concat()

        String ex = "Hello";
        ex = "Sample";
        ex = ex.concat("World");
        System.out.println(ex);

        /*
            Create String using literals vs new keyword
            Now that we know how strings are created using string literals and the new keyword, let's see what is the major difference between them.

            In Java, the JVM maintains a string pool to store all of its strings inside the memory. The string pool helps in reusing the strings.

            1. While creating strings using string literals,
                String example = "Java";
            *Here, we are directly providing the value of the string (Java). Hence, the compiler first checks the string pool to see if the string already exists
                -If the string already exists, the new string is not created. Instead, the new reference, example points to the already existed string (Java).
                -If the string doesn't exist, the new string (Java is created.
            2. While creating strings using the new keyword,
                String example = new String("Java");
             Here, the value of the string is not directly provided. Hence, a new "Java" string is created even though "Java" is already present inside the memory pool.
         */

    }
}
