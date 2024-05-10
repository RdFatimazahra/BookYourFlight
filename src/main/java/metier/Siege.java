package metier;

import javax.persistence.*;

@Entity
@Table(name = "siege")
public class Siege {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "numero")
    private String numero;

    @ManyToOne
    @JoinColumn(name = "vol_id")
    private Vol vol;

    // Constructeur par défaut
    public Siege() {
    }

    // Constructeur avec numéro de siège et vol associé
    public Siege(String numero, Vol vol) {
        this.numero = numero;
        this.vol = vol;
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

    public Vol getVol() {
        return vol;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }
}
