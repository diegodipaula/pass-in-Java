package com.turtlemedia.passin.domain.attendee.exceptions;

public class AttendeeNotFoundException extends RuntimeException{
    public AttendeeNotFoundException(String message){
        super(message);
    }
}
