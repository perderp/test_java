package Access;

public class AccessPub{
    public static void main(String[] args) {
        ThePub thePub = new ThePub();

        thePub.drinksCount = 3;

        thePub.display();
    }
}

class ThePub{
    int drinksCount;

    public void display(){
        System.out.println("I have drinked " + drinksCount + ".");
    }
}

// SEE PERSON FOLDER