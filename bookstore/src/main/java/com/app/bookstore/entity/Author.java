package com.app.bookstore.entity;

import java.time.LocalDate;
import java.util.UUID;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Builder
public class Author {
    @Id
    private UUID id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String avatar;
    private String gender;
    private LocalDate birthdate;
}
