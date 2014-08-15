package org.kimani.manager;

import org.hibernate.Session;
import org.kimani.manager.mapping.Person;
import org.kimani.manager.util.HibernateUtil;

/**
 * Created by alex on 8/15/14.
 */
public class Display {
	public static void main( String[] args )
	{
		System.out.println("Maven + Hibernate + MySQL");
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		Person person = new Person();

		person.setPersonName("Joe Alex Kimani");

		session.save(person);
		session.getTransaction().commit();
	}
}
