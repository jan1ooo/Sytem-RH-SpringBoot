package com.jan1ooo.systemrh.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vaga {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_vaga;

    @NotNull
    private String title;

    @NotNull
    private String description;

    @NotNull
    private String date;

    @NotNull
    private Double salary;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "vaga")
    private List<Candidate> candidates = new ArrayList<>();
}
