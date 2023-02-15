package com.example.andreyexam.domain.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "items")
public class Item extends BaseEntityuuid {
    //⦁	Has a Name (unique)
    //⦁	Username must be unique
    //⦁	Username length must be more than two characters
    //⦁	Has a Description
    //⦁	Description length must be more than three characters
    //⦁	Has a Price
    //⦁	Price must be positive number
    //⦁	Has a Category
    //⦁	Has a relation with Categories
    //⦁	Has a Gender – an option between (Male and Female

    public String name;
    public String description;
    public BigDecimal price;
public Category category;
    public Gender gender;


    @Column(name = "username", unique = true, nullable = false)
    public String getName() {
        return name;
    }

    public Item setName(String name) {
        this.name = name;
        return this;
    }

    @Column(name = "description", columnDefinition = "TEXT")
    public String getDescription() {
        return description;
    }

    public Item setDescription(String description) {
        this.description = description;
        return this;
    }

    @Column(name = "price")
    public BigDecimal getPrice() {
        return price;
    }

    public Item setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
 @ManyToOne
    @JoinColumn(name = "category_id")
    public Category getCategory() {
        return category;
    }

    public Item setCategory(Category category) {
        this.category = category;
        return this;
    }

    @Enumerated(EnumType.STRING)
    public Gender getGender() {
        return gender;
    }

    public Item setGender(Gender gender) {
        this.gender = gender;
        return this;
    }

    public Item() {
    }
}
