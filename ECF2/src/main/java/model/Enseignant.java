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
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_de")
    Departement departement;

    public int getId_en() {
        return id_en;
    }

    public void setId_en(int id_en) {
        this.id_en = id_en;
    }

    public int getAge_en() {
        return age_en;
    }

    public void setAge_en(int age_en) {
        this.age_en = age_en;
    }

    public String getNom_en() {
        return nom_en;
    }

    public void setNom_en(String nom_en) {
        this.nom_en = nom_en;
    }

    public String getPrenom_en() {
        return prenom_en;
    }

    public void setPrenom_en(String prenom_en) {
        this.prenom_en = prenom_en;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public Boolean getEstPrincipal() {
        return estPrincipal;
    }

    public void setEstPrincipal(Boolean estPrincipal) {
        this.estPrincipal = estPrincipal;
    }
    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public Enseignant() {
    }

    public Enseignant(int age_en, String nom_en, String prenom_en, String grade, Boolean estPrincipal) {
        this.age_en = age_en;
        this.nom_en = nom_en;
        this.prenom_en = prenom_en;
        this.grade = grade;
        this.estPrincipal = estPrincipal;
    }

    public Enseignant(int age_en, String nom_en, String prenom_en, String grade, Boolean estPrincipal, Departement departement) {
        this.age_en = age_en;
        this.nom_en = nom_en;
        this.prenom_en = prenom_en;
        this.grade = grade;
        this.estPrincipal = estPrincipal;
        this.departement = departement;
    }

    @Override
    public String toString() {
        return "Enseignant{" +
                "id_en = " + id_en +
                ", age_en = " + age_en +
                ", nom_en = " + nom_en +
                ", prenom_en = " + prenom_en +
                ", grade = " + grade +
                ", estPrincipal = " + estPrincipal +
                ", departement = " + departement +
                ". ";
    }
}
