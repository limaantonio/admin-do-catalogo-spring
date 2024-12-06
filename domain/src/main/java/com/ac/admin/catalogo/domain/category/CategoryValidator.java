package com.ac.admin.catalogo.domain.category;

import com.ac.admin.catalogo.domain.validation.Error;
import com.ac.admin.catalogo.domain.validation.ValidationHandler;
import com.ac.admin.catalogo.domain.validation.Validator;

public class CategoryValidator extends Validator {

    private final Category category;

    public CategoryValidator(final Category category, final ValidationHandler aHandler) {
        super(aHandler);
        this.category = category;
    }

    @Override
    public void validate() {
        if (this.category.getName() == null){
            this.validationHandler().append(new Error("'name' should not be null"));
        }
    }
}
