package utils;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.util.Properties;

/**
 * User: Bogdan
 */

public class SessionFactorySingleton {
    private static SessionFactory sessionFactory = null;
    private static ServiceRegistry serviceRegistry = null;

    private SessionFactorySingleton() {
    }

    public static SessionFactory getInstance() throws HibernateException {

        if (sessionFactory == null) {
            Configuration configuration = new Configuration();
            configuration.configure();
            Properties properties = configuration.getProperties();
            serviceRegistry = new ServiceRegistryBuilder().applySettings(properties).buildServiceRegistry();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
            return sessionFactory;
        }
        return sessionFactory;
    }
}
