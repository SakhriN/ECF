package model;

import javax.persistence.*;

@Entity
public class Classe {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_cl;

    String nom_cl;

    @ManyToOne
    @JoinColumn(name = "id_de")
    Departement departement;


    public int getId_cl() {
        return id_cl;
    }

    public void setId_cl(int id_cl) {
        this.id_cl = id_cl;
    }

    public String getNom_cl() {
        return nom_cl;
    }

    public void setNom_cl(String nom_cl) {
        this.nom_cl = nom_cl;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    @Override
    public String toString() {
        return "Classe : " +
                "id_cl= " + id_cl +
                ", nom_cl= " + nom_cl +
                ". ";
    }
}
