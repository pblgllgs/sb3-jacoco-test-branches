package com.pblgllgs.jacoco;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MessageTest {


    @Test
    void givenMessage_whenGetMessage_thenMessageReturn(){
        Message message = new Message();
        assertEquals("Hello pblgllgs!", message.getMessage("pblgllgs"));
    }

    @Test
    void givenEmptyString_whenGetMessage_thenReturnMissingMessageReturn(){
        Message message = new Message();
        String msg = "";
        assertEquals("Please Provide a name!", message.getMessage(msg));
    }

    @Test
    void givenObjectNull_whenGetMessage_thenReturnMissingMessageReturn(){
        Message message = new Message();
        String msg = null;
        assertEquals("Please Provide a name!", message.getMessage(msg));
    }

}