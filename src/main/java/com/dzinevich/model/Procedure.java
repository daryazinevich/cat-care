package com.dzinevich.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "procedure")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class Procedure {
    @Id
    @GeneratedValue
    private UUID procedureId;

    @NonNull
    private LocalDate date;

    private String description;
    private String result;

    @ManyToOne
    @JoinColumn(name = "cat_id", nullable = false)
    private Cat cat;
}
