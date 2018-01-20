public class LightonnCommand implements Command {

    Light light;

    public LightonnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }

}
