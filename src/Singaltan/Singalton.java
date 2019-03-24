package Singaltan;


public class Singalton {
    protected static final Singalton INSTANCE = new Singalton();

    public static Singalton getInstance() {
        return INSTANCE;
    }
}
