package org.example.db;

import org.example.entity.Car;
import org.example.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.query.Query;



import java.util.List;

public class CarDb {
    public static Car create(Car car){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(car);
        session.getTransaction();
        session.close();
        return car;

    }
    public static List<Car> getAll(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        List<Car> cars = session.createQuery("from org.example.entity.Car").list();
        session.close();
        return cars;
    }

    public static Car update(Car car){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Car c = session.load(Car.class,car.getId());
        c.setId(car.getId());
        c.setModel(car.getModel());
        c.setCarNum(car.getCarNum());
        session.getTransaction().commit();
        session.close();
        return c;
    }

    public  static Car findById (Integer id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        Car employee = session.load(Car.class, id);
        session.close();
        return employee;
    }
    public static void deleteById (Integer id){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Car c = findById(id);
        session.delete(c);
        session.getTransaction().commit();
        session.close();
    }

    public static void delete(Car car){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        Query query = session.createQuery("delete from Car");
        session.getTransaction().commit();
        session.close();

    }
}
