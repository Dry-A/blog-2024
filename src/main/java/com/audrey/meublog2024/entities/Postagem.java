package com.audrey.meublog2024.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "tb_postagens")
public class Postagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Título obrigatório!")
    @Size(min = 5, max = 100, message = "Minimo de 5 e máximo de 100 caracteres!")
    private String titulo;

    @NotBlank(message = "Texto obrigatório!")
    @Size(min = 10, max = 1000, message = "Minimo de 10 e máximo de 1000 caracteres!")
    private String texto;

    @UpdateTimestamp
    private LocalDateTime data;

    @ManyToOne
    @JsonIgnoreProperties("postagem")
    private Categoria categoria;

}
