package com.jan1ooo.systemrh.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Candidate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_candidate;

    @NotNull
    private String name;

    @NotNull
    @CPF
    @Column(unique = true)
    private String cpf;

    @NotNull
    private String email;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id_vaga", nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Vaga vaga;
}
