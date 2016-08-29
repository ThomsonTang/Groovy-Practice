package java_prj.src.main.java.gradle.sample;

import java.util.ResourceBundle;

import java_prj.src.api.java.gradle.sample.ReadWelcomeMessage;

public class Sample implements ReadWelcomeMessage {
    public Sample() {}

    public String getWelcomeMessage() {
        final ResourceBundle resourceBundle = ResourceBundle.getBundle("messages");
        final String message = resourceBundle.getString("welcome");
        return message;
    }
}
