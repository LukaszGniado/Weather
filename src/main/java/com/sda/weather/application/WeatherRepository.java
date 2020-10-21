package com.sda.weather.application;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


import java.util.List;


public class WeatherRepository {

    private final SessionFactory sessionFactory;

    public WeatherRepository() {
        StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure().build();

        sessionFactory = new MetadataSources(registry)
                .buildMetadata()
                .buildSessionFactory();
    }

    public Weather saveNewWeather(Weather weather) {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.persist(weather);

        transaction.commit();
        session.close();

        return weather;
    }

    public List<Weather> showAddLocation() {
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        List<Weather> result = session.createQuery("FROM Weather").getResultList();


        transaction.commit();
        session.close();

        return result;
    }
}


