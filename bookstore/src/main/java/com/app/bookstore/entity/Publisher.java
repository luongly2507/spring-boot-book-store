package com.app.bookstore.entity;

import java.util.Set;
import java.util.UUID;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Publisher {
    @Id
    private UUID id;
    private String name;
    private String address;

    @OneToMany (mappedBy = "publisher", cascade = CascadeType.ALL)
    private Set<Book> books;
}
