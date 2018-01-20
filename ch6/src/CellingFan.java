public class CellingFan {
    String location;

    public CellingFan(String location) {
        this.location = location;
    }
    public void on() {
           System.out.println(location + " fan is on");
    }

    public void off() {
        System.out.println(location + "fan os off");
    }
}
