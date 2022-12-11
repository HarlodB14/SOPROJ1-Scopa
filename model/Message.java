package model;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class Message {

    private StringProperty messagetext = new SimpleStringProperty(this, "CardInfo", "");

    // setter
    public void setMessageText(String newtext) {
        messagetext.set(newtext);
    }

    // getter
    public String getMessageText() {
        return messagetext.get();
    }

    // property accessor
    public final StringProperty messagetextProperty() {
        return messagetext;
    }
}
