package Constructor;

public class COverload {
    String language;

    COverload(){
        this.language = "Java";
    }
    COverload(String lang){
        this.language = lang;
    }

    public void getName(){
        System.out.println("Programming Language : " + this.language);
    }

    public static void main(String[] args) {
        COverload obj = new COverload();
        COverload obj02 = new COverload("Javascript");

        obj.getName();
        obj02.getName();
    }
}
