package com.example.bookurflight.connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateConfg {
    private static SessionFactory factory;

    private HibernateConfg() {}

    public static SessionFactory getFactory() {

            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            factory = configuration
                    .buildSessionFactory();

        return factory;
    }
}