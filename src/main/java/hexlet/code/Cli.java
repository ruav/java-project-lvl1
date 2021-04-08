package hexlet.code;

public class Cli {

    private static String name;

    public static String getName() {
        return name;
    }

    public static void hello() {
        Engine.printMessage("Welcome to the Brain Games!");
        Engine.printMessage("May I have your name? ");
        name = Engine.readLine();
        Engine.printMessage("Hello, " + name + "!");
    }
}
