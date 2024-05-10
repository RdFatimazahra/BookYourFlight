package metier;

import metier.Vol;
import hibernate.dao.HibernateDAO;
import hibernate.dao.HibernateDAOImpl;

public class Main {
    public static void main(String[] args) {
        HibernateDAO hibernateDAO = new HibernateDAOImpl();

        // Création d'un nouvel objet Vol
        Vol vol = new Vol();
        vol.setNumero("123");
        vol.setDateDepart("2024-05-10");
        vol.setVilleDepart("Paris");
        vol.setVilleArrivee("New York");
        vol.setDuree(480);

        try {
            // Sauvegarde du vol dans la base de données
            hibernateDAO.save(vol);
            System.out.println("Vol ajouté avec succès !");
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
