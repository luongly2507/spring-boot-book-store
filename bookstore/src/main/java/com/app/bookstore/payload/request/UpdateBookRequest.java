package com.app.bookstore.payload.request;

import java.time.LocalDate;
import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class UpdateBookRequest {
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
    private UUID categoryId;
    private UUID publisherId;
}
