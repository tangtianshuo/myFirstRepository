package com.codingstudy.b2c.configuration.auth;

import org.springframework.security.access.AccessDeniedException;

public class MyaccessDeniedException extends AccessDeniedException {


    public MyaccessDeniedException(String msg) {
        super(msg);
    }
}
