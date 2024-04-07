package CommandPattern;

public class Room {
    Command command;

    public Room() { }

    // this way we decouple
    // the classes that invoke operations
    // from the classes that do the operations
    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}
