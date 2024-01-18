package model;

import javax.persistence.*;

@Entity
public class EDT {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_em;
}
