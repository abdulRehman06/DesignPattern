package FactoryPattern.messge;

public class TextMessage  extends Message {
    @Override
    public String getContent() {
        return "Text";
    }
    @Override
    public void encrypt() {
        System.out.println("Text encrypt");
    }
}
