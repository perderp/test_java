package Access;
class Animal{
    protected void display(){
        System.out.println("I am an animal");
    }
}
public class AccessPro extends Animal {
    public static void main(String[] args) {
        AccessPro dog = new AccessPro();
        dog.display();
    }
}
