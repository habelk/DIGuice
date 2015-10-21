package com.demo.guice;

public class MockMessageService implements MessageService {

    public boolean sendMessage(final String msg, final String receipient) {
        System.out.println("mock message service executed");
        return true;
    }

}
