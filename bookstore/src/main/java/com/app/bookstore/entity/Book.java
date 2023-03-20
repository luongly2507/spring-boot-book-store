package com.app.bookstore.entity;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Book {
    @Id
    private UUID id;
    private String title;
    private String subTitle;
    private String language;
    private String description;
    private String image;
    private String status;
    private String edition;
    private double price;
    private double cost;
    private int quantity;
    private LocalDate publishcationDate;

}
