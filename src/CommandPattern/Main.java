package CommandPattern;

public class Main {
    public static void main(String[] args) {
        // to execute a command we would do the following

        // initialize the new room
        Room livingRoom = new LivingRoom();

        // set which command we want to execute
        // the extension of commands, this way is endless
        livingRoom.setCommand(
                new SwitchLightsCommand(new Light())
        );

        // and execute it :D
        livingRoom.executeCommand();
    }
}
