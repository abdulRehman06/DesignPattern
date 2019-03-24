package FactoryPattern.messge;

public class JSONMessage  extends Message{

    @Override
    public String getContent() {
        return "{\"JSON]\":[]}";
    }

    @Override
    public void encrypt() {
        System.out.println("JSON encrypt");
    }

}
