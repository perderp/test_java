package Access;
class Data{
    private String name;

    public String getName(){
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class AccessPriv {
    public static void main(String[] args) {

        Data newData = new Data();

        // newData.name = "Per";   will result on error so in order for this to work use setters and getters

        newData.setName("Per");
        System.out.println(newData.getName());
    }
}
