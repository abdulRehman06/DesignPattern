package FactoryPattern;


import FactoryPattern.messge.Message;

public class Client {
    public static void main(String[] args) {
        printMessage(new JSONMessageCreator());
        printMessage(new TextMessageCreator());
//       Message abc =  retuenMessage(new TextMessageCreator());

    }

    public static void printMessage(MessageCreator creator) {
        Message msg = creator.getMessage();
        System.out.println(msg);
    }
    public static Message retuenMessage(MessageCreator creator) {
        Message msg = creator.getMessage();
        return msg;
    }
}
