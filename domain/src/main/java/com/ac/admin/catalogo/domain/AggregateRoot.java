package com.ac.admin.catalogo.domain;

import com.ac.admin.catalogo.domain.validation.ValidationHandler;

public class AggregateRoot<ID extends Identifier> extends  Entity<ID>{

    protected AggregateRoot(final ID id) {
        super(id);
    }

    @Override
    public void validate(ValidationHandler handler) {

    }
}
