package com.example.andreyexam.domain.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category extends BaseEntityuuid {
    //⦁	Has a Name – an option between (Shirt, Denim, Shorts or Jacket)
    //⦁	Has a Description
    public CategoryEnumName name;
    public String description;

@Enumerated(EnumType.STRING)
    public CategoryEnumName getName() {
        return name;
    }

    public Category setName(CategoryEnumName name) {
        this.name = name;
        return this;
    }
@Column(columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public Category setDescription(String description) {
        this.description = description;
        return this;
    }

    public Category() {
    }
}
