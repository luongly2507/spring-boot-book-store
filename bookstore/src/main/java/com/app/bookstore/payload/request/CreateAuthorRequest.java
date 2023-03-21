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
public class CreateAuthorRequest {
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String avatar;
    private String gender;
    private LocalDate birthdate;
    private UUID bookId;
}
