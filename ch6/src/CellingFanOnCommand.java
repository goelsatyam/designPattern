public class CellingFanOnCommand implements Command {

    CellingFan cellingFan;

    public CellingFanOnCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        cellingFan.on();
    }

    @Override
    public void undo() {
        cellingFan.off();
    }
}
