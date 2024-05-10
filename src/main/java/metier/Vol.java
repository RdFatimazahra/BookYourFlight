package metier;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vol {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Duree;
    private String HeureDepart;
    private String HeureArrive;
    private String VilleDepart;
    private String VilleArrive;

    public Vol(Integer id, String duree, String heureDepart, String heureArrive, String villeDepart, String villeArrive) {
        this.id = id;
        Duree = duree;
        HeureDepart = heureDepart;
        HeureArrive = heureArrive;
        VilleDepart = villeDepart;
        VilleArrive = villeArrive;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDuree() {
        return Duree;
    }

    public void setDuree(String duree) {
        Duree = duree;
    }

    public String getHeureDepart() {
        return HeureDepart;
    }

    public void setHeureDepart(String heureDepart) {
        HeureDepart = heureDepart;
    }

    public String getHeureArrive() {
        return HeureArrive;
    }

    public void setHeureArrive(String heureArrive) {
        HeureArrive = heureArrive;
    }

    public String getVilleDepart() {
        return VilleDepart;
    }

    public void setVilleDepart(String villeDepart) {
        VilleDepart = villeDepart;
    }

    public String getVilleArrive() {
        return VilleArrive;
    }

    public void setVilleArrive(String villeArrive) {
        VilleArrive = villeArrive;
    }
}
