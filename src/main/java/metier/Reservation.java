package metier;


import javax.persistence.*;

@Entity
@Table(name = "reservation")
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "vol_id")
    private Vol vol;

    // Ajoutez d'autres champs et relations avec d'autres entités le cas échéant

    // Constructeur par défaut
    public Reservation() {
    }

    // Constructeur avec client et vol
    public Reservation(Client client, Vol vol) {
        this.client = client;
        this.vol = vol;
    }

    // Getters et setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Vol getVol() {
        return vol;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }
}
