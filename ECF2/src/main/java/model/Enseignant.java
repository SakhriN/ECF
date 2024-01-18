package model;

import javax.persistence.*;

@Entity
public class Enseignant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_en;
    int age_en;

    String nom_en, prenom_en, grade;
    Boolean estPrincipal;
}
