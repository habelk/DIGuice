package com.demo.guice;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class TesterApplication {

    public static void main(final String[] args) {
        final Injector injector = Guice.createInjector(new AppInjector());

        final Application app = injector.getInstance(Application.class);

        app.sendMessage("Hi", "hh@cerner.com");
    }

}
