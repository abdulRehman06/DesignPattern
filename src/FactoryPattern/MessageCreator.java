package FactoryPattern;

import FactoryPattern.messge.Message;

public abstract class MessageCreator {
    public Message getMessage(){
        Message msg = createMessage();
        System.out.println(msg.getContent());
        return msg;

    }
    protected abstract Message createMessage();
}
