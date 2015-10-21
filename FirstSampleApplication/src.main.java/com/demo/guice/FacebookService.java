package com.demo.guice;


// import com.google.inject.Singleton;

public class FacebookService implements MessageService {

    public boolean sendMessage(final String msg, final String receipient) {
        // some complex code to send Facebook message
        System.out.println("Message sent to Facebook user " + receipient + " with message=" + msg);
        return true;
    }

}
