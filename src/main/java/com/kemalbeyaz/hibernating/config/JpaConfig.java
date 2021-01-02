package com.kemalbeyaz.hibernating.config;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * @author kemal.beyaz
 */
public class JpaConfig {

    private static final EntityManagerFactory entityManagerFactory;

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }

    static {
        entityManagerFactory = Persistence.createEntityManagerFactory("test");
    }

    private JpaConfig() {
    }
}
