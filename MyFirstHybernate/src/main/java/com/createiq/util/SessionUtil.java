package com.createiq.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionUtil {

	private static SessionFactory Sf = null;
	static {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		Sf = configuration.buildSessionFactory();
	}

	public static Session getSession() {
		Session session = Sf.openSession();
		return session;

	}

	public static void close(Session session) {
		if (session != null) {
			session.close();

		}
	}
}
