package Singaltan;

public class Clint {
    public static void main(String [] args)
    {
        System.out.println("Singalton class");
        Singalton obj1 = Singalton.getInstance();
        Singalton obj2 = Singalton.getInstance();
        if (obj1 == obj2) {
            System.out.println("Both are same object");
        }
    }
}
