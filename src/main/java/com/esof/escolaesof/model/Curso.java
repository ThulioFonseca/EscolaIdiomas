package com.esof.escolaesof.model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.List;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Curso {

    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;

    private String nome;

    private String idioma;

    private String nivel;

    private String turno;


}

