package com.revature.projectweb02.exception;

import org.springframework.mail.MailException;

public class SpringRedditException extends RuntimeException {
    public SpringRedditException(String exMessage, Exception exception) {
        super(exMessage, exception);
        System.out.println("hello");
    }

    public SpringRedditException(String exMessage) {
        super(exMessage);
        
    }
}
