package com.example.bookurflight.dao;

import com.example.bookurflight.model.Client;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TestClientAddition {

    public static void main(String[] args) {
        // Création d'une configuration Hibernate à partir du fichier hibernate.cfg.xml
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");

        // Création de la session factory
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        // Création d'une nouvelle session Hibernate
        try (Session session = sessionFactory.openSession()) {
            // Début de la transaction
            Transaction transaction = session.beginTransaction();

            // Création d'un nouvel objet Client
            Client client = new Client("Nom", "Prénom", "email@example.com");

            // Enregistrement du client dans la base de données
            session.save(client);

            // Commit de la transaction
            transaction.commit();

            System.out.println("Client ajouté avec succès !");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Fermeture de la session factory à la fin de l'opération
            sessionFactory.close();
        }
    }
}
