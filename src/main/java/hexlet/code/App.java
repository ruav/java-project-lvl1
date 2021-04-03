package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        choseLogic();
    }

    public static void choseLogic() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.print("1 - Greet\n2 - Even\n0 - Exit\nYour choice: ");
        Scanner scanner = new Scanner(System.in);
        int select = scanner.nextInt();
        System.out.println(select);
        switch (select) {
            case 1:
                Cli.welcomeMethod();
                break;
            case 2:
                Cli.even();
            default:
                break;
        }
    }
}
