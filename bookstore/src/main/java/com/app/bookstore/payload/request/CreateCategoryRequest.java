package com.app.bookstore.payload.request;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CreateCategoryRequest {
    private UUID id;
    private String name;
    private UUID bookId;
}
