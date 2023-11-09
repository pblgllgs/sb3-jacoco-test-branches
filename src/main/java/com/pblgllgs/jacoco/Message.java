package com.pblgllgs.jacoco;

/**
 * @author pblgl
 * Created on 09-11-2023
 */

public class Message {
    public String getMessage(String name)
    {
        StringBuilder s = new StringBuilder();
        if(name == null || name.trim().isEmpty())
        {
            s = s.append("Please Provide a name!");
        }
        else
        {
            s.append("Hello ").append(name).append("!");
        }
        return s.toString();
    }
}
