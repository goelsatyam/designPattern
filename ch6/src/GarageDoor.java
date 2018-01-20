public class GarageDoor{
    String type;

    public GarageDoor(String type) {
        this.type = type;
    }

    public void up() {
        System.out.println(type + " Garage door is open");
    }

    public void down() {
        System.out.println(type + " Garage door is close");
    }


}
