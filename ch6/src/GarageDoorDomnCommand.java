public class GarageDoorDomnCommand implements Command{

    GarageDoor garageDoor;

    public GarageDoorDomnCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    public void execute() {
        garageDoor.up();
    }

    @Override
    public void undo() {
        garageDoor.down();
    }
}
