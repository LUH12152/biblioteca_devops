package com.example.biblioteca.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data //Evitar definir getters y setters
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="libro")
public class Libro {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @Column(nullable = false)
    private String titulo;

    @Column
    private String autor;
}
