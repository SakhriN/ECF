package model;
import javax.persistence.*;
import java.util.List;

@Entity
public class Departement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id_de;

    String nom_de;

    @OneToMany(mappedBy = "departement", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Classe> classeList;

    public int getId_de() {
        return id_de;
    }

    public void setId_de(int id_de) {
        this.id_de = id_de;
    }

    public String getNom_de() {
        return nom_de;
    }

    public void setNom_de(String nom_de) {
        this.nom_de = nom_de;
    }

    public Departement() {
    }

    public Departement(String nom_de) {
        this.nom_de = nom_de;
    }

    public Departement(String nom_de, List<Classe> classeList) {
        this.nom_de = nom_de;
        this.classeList = classeList;
    }

    @Override
    public String toString() {
        return "Departement : " +
                "id_de = " + id_de +
                ", nom_de = " + nom_de +
                ". ";
    }
}
