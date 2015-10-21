package com.demo.guice;

import com.google.inject.Inject;

public class Application {

    private final MessageService service;

    // constructor based injector
    @Inject
    public Application(final MessageService svc) {
        this.service = svc;
    }

    // // setter method injector
    // @Inject
    // public void setService(final MessageService svc) {
    // this.service = svc;
    // }

    public boolean sendMessage(final String msg, final String rec) {
        // some business logic here
        return service.sendMessage(msg, rec);
    }
}
