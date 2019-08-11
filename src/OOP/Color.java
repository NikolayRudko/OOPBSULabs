package OOP;

public enum Color {
    BLUE("Blue"), GREEN("Green"), PINK("Pink"), RED("Red"), WHITE("White"), YELLOW("Yellow");

    private String str;

    Color(String str) {
        this.str = str;
    }

    public String printColor(){
        return str;
    }
}
