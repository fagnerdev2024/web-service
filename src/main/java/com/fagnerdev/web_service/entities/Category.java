package com.fagnerdev.web_service.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;


@EqualsAndHashCode
@Getter
@Setter
@Entity
@Table(name = "tb_category")
public class Category implements Serializable {


    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @JsonIgnore
    @ManyToMany(mappedBy = "categories")
    private Set<Product> products = new HashSet<>();



    public Category() {
    }

    public Category(Long id, String name) {
        super();
        this.id = id;
        this.name = name;
    }
}

