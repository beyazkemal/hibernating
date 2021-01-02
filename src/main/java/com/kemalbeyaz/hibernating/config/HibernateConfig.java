package com.kemalbeyaz.hibernating.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author kemal.beyaz
 */
public class HibernateConfig {
    private static final SessionFactory sessionFactory;

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    static {
        Configuration cfg = new Configuration().configure();
        sessionFactory = cfg.buildSessionFactory();
    }

    private HibernateConfig() {
    }
}
