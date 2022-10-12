package Interface;

interface Language {
    void getName(String name);
}

// class implements interface
class ProgrammingLanguage implements Language{
    //implementation of abstract method
    public void getName(String name){
        System.out.println("Programming Language : " + name);
    }
}

class Main02{
    public static void main(String[] args) {
        ProgrammingLanguage p1 = new ProgrammingLanguage();
        p1.getName("Java");
    }
}
