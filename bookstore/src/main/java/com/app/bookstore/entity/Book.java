package com.app.bookstore.entity;

import java.time.LocalDate;
import java.util.Set;
import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Builder
public class Book {
    @Id
    @Column(nullable = false, updatable = false)
    @GenericGenerator(name = "uuid", strategy = "org.hibernate.id.UUIDGenerator")
    @GeneratedValue(generator = "uuid")
    private UUID id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String subTitle;

    @Column(nullable = true)
    private String language;

    @Column(nullable = true)
    private String description;

    @Column(nullable = true)
    private String image;

    @Column(nullable = true)
    private String status;

    @Column(nullable = true)
    private String edition;

    @Column(nullable = true)
    private double price;

    @Column(nullable = true)
    private double cost;

    @Column(nullable = true)
    private int quantity;

    @Column(nullable = true)
    private LocalDate publishcationDate;

    @ManyToOne // nhiều sách có chung một thể loại
    /*
     * category_id trong table Book là 
     * khóa ngoại ràng buộc với id của table category
     */
    @JoinColumn(name = "category_id", nullable = true) 
    private Category category;

    @ManyToMany(mappedBy = "books")
    private Set<Author> authors;

    @ManyToOne
    @JoinColumn (name = "publisher_id", nullable = true)
    private Publisher publisher;

    
}
