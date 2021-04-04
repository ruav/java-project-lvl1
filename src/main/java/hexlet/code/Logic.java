package hexlet.code;

public enum Logic {
    Exit(0, "Exit"),
    Greet(1, "Greet"),
    Even(2, "Even"),
    Calc(3, "Calc"),
    GCD(4, "GCD"),
    Progression(5, "Progression"),
    Prime(6, "Prime");


    private int num;
    private String name;

    Logic(int numOfMenu, String nameOfMenu) {
        this.num = numOfMenu;
        this.name = nameOfMenu;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }
}
