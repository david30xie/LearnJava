package me.davidx.LearnJava;

import me.davidx.LearnJava.beans.Event;
import me.davidx.LearnJava.utils.HibernateUtil;
import org.hibernate.Session;

import java.util.Date;

public class EventTest {
	public static void main(String[] args) throws Exception {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Event event = new Event();
		event.setTitle("Let's have a test");
		event.setDate(new Date());

		session.save(event);
		session.getTransaction().commit();
	}
}
