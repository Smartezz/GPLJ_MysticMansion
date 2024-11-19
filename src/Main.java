public class Main {
    public static void main(String[] args) {

        Parser parser = new Parser();

        boolean finished = false;
        while (! finished) {
            Command command = parser.getCommand();
            finished = processCommand(command);
        }
        System.out.println("Thank you for playing.  Good bye.");

    }

    private static boolean processCommand(Command command)
    {
        boolean wantToQuit = false;

        if(command.isUnknown()) {
            System.out.println("I don't know what you mean...");
            return false;
        }

        String commandWord = command.getCommandWord();
        if (commandWord.equals("help"))
            System.out.println("HELP");
        else if (commandWord.equals("go"))
            System.out.println("GO");
        else if (commandWord.equals("quit")) {
            wantToQuit =true;
        }
        return wantToQuit;
    }
}
