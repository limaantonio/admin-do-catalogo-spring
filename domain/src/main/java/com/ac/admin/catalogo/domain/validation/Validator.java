package com.ac.admin.catalogo.domain.validation;

public abstract class Validator {

    private final ValidationHandler handler;

    protected Validator(final ValidationHandler anHandler) {
        this.handler = anHandler;
    }

    abstract public void validate();

    protected ValidationHandler validationHandler () {
        return this.handler;
    }
}
