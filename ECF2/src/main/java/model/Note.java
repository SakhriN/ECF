package model;

import javax.persistence.*;

@Entity
public class Note {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_no;


    int note;
}
