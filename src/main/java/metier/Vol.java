package metier;

import javax.persistence.*;

@Entity
@Table(name = "vol")
public class Vol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero")
    private String numero;

    @Column(name = "date_depart")
    private String dateDepart;

    @Column(name = "ville_depart")
    private String villeDepart;

    @Column(name = "ville_arrivee")
    private String villeArrivee;

    @Column(name = "duree")
    private int duree; // Durée en minutes

    // Constructeur par défaut
    public Vol() {
    }

    // Constructeur avec numéro, date de départ, villes de départ et d'arrivée, et durée
    public Vol(String numero, String dateDepart, String villeDepart, String villeArrivee, int duree) {
        this.numero = numero;
        this.dateDepart = dateDepart;
        this.villeDepart = villeDepart;
        this.villeArrivee = villeArrivee;
        this.duree = duree;
    }

    // Getters et setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDateDepart() {
        return dateDepart;
    }

    public void setDateDepart(String dateDepart) {
        this.dateDepart = dateDepart;
    }

    public String getVilleDepart() {
        return villeDepart;
    }

    public void setVilleDepart(String villeDepart) {
        this.villeDepart = villeDepart;
    }

    public String getVilleArrivee() {
        return villeArrivee;
    }

    public void setVilleArrivee(String villeArrivee) {
        this.villeArrivee = villeArrivee;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }
}
