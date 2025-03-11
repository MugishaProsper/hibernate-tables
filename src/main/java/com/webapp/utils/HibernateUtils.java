package com.webapp.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class HibernateUtils {
    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("school_db");

    public static EntityManager getEntityManager() {
        return emf.createEntityManager();
    }
}

