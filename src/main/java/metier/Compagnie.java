package metier;

import javax.persistence.*;

@Entity
@Table(name = "compagnie")
public class Compagnie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nom")
    private String nom;

    // Constructeur par défaut
    public Compagnie() {
    }

    // Constructeur avec nom
    public Compagnie(String nom) {
        this.nom = nom;
    }

    // Getters et setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
