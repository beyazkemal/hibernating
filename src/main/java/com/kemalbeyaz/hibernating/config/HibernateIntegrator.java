package com.kemalbeyaz.hibernating.config;

import org.hibernate.boot.Metadata;
import org.hibernate.engine.spi.SessionFactoryImplementor;
import org.hibernate.integrator.spi.Integrator;
import org.hibernate.service.spi.SessionFactoryServiceRegistry;

/**
 * @author kemal.beyaz
 */
public class HibernateIntegrator implements Integrator {

    private static Metadata metadata;

    private static SessionFactoryImplementor sessionFactory;

    private static SessionFactoryServiceRegistry serviceRegistry;

    @Override
    public void integrate(Metadata metadata, SessionFactoryImplementor sessionFactory, SessionFactoryServiceRegistry serviceRegistry) {
        setMetadata(metadata);
        setSessionFactory(sessionFactory);
        setSessionFactory(sessionFactory);
    }

    @Override
    public void disintegrate(SessionFactoryImplementor sessionFactory, SessionFactoryServiceRegistry serviceRegistry) {
    }

    public static Metadata getMetadata() {
        return metadata;
    }

    public static void setMetadata(Metadata metadata) {
        HibernateIntegrator.metadata = metadata;
    }

    public static SessionFactoryImplementor getSessionFactory() {
        return sessionFactory;
    }

    public static void setSessionFactory(SessionFactoryImplementor sessionFactory) {
        HibernateIntegrator.sessionFactory = sessionFactory;
    }

    public static SessionFactoryServiceRegistry getServiceRegistry() {
        return serviceRegistry;
    }

    public static void setServiceRegistry(SessionFactoryServiceRegistry serviceRegistry) {
        HibernateIntegrator.serviceRegistry = serviceRegistry;
    }
}
