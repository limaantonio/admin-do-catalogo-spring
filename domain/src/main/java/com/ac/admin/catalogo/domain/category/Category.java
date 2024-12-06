package com.ac.admin.catalogo.domain.category;

import com.ac.admin.catalogo.domain.AggregateRoot;
import com.ac.admin.catalogo.domain.validation.ValidationHandler;

import java.time.Instant;

public class Category extends AggregateRoot<CategoryID> {

    private String name;
    private String description;
    private boolean active;
    private Instant createdAt;
    private Instant updatedAt;
    private Instant deleteAt;

    public Category(CategoryID anId, final String name, final String description, final boolean active,
                    final Instant createdAt, final Instant updatedAt, final Instant deleteAt) {
        super(anId);
        this.name = name;
        this.description = description;
        this.active = active;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deleteAt = deleteAt;
    }

    public static Category newCategory(
            final String aName, final String aDescription, final boolean isActive
    ) {
        final var  id = CategoryID.unique();
        final var now  = Instant.now();
        return new Category(id, aName, aDescription, isActive, now, now, null);
    }

    @Override
    public void validate(final ValidationHandler handler) {
        new CategoryValidator(this, handler).validate();
    }

    public CategoryID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isActive() {
        return active;
    }

    public Instant getCreatedAt() {
        return createdAt;
    }

    public Instant getUpdatedAt() {
        return updatedAt;
    }

    public Instant getDeleteAt() {
        return deleteAt;
    }
}
