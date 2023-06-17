package com.jan1ooo.systemrh.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
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

    @NotEmpty
    private String title;

    @NotEmpty
    private String description;

    @NotEmpty
    private String date;

    private Double salary;

    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true, mappedBy = "vaga")
    private List<Candidate> candidates = new ArrayList<>();
}
