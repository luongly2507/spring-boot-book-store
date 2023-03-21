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
public class UpdatePublisherRequest {
    private UUID id;
    private String name;
    private String address;
    private UUID bookId;
}
