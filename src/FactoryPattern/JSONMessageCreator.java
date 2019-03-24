package FactoryPattern;
import FactoryPattern.messge.Message;
import FactoryPattern.messge.JSONMessage;
public class JSONMessageCreator extends MessageCreator {
    @Override
    public Message createMessage() {
        // FactoryPattern.messge.JSONMessage;
        return new JSONMessage();
    }
}
