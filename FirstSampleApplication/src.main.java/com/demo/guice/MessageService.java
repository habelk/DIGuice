package com.demo.guice;

import com.google.inject.ImplementedBy;

/**
 * Description.
 * @author Your Name
 */

@ImplementedBy(FacebookService.class)
public interface MessageService {

    boolean sendMessage(String msg, String receipient);
}
