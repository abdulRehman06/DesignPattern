package FactoryPattern;
import FactoryPattern.messge.Message;
import FactoryPattern.messge.TextMessage;

public class TextMessageCreator extends MessageCreator {

    @Override
    public Message createMessage() {
        // FactoryPattern.messge.TEXTMessage;
        return new TextMessage();
    }
}
