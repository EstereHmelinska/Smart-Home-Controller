package com.bootcamp.smarthome.exception;

public class InvalidValueException extends HomeAutomationException {

    private final String field;
    private final Object value;
    private final String constraint;

    public InvalidValueException(String field, Object value, String constraint) {
        super(field + " value '" + value + "' violates constraint: " + constraint);
        this.field = field;
        this.value = value;
        this.constraint = constraint;
    }
}
