package com;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.pojo.Person;
import com.pojo.TCom;
import com.pojo.TEmp;
import com.pojo.TOrder;
import com.pojo.TOrderDetail;
import com.pojo.TUser;
import com.pojo.TUserId;
import com.pojo.Tel;

public class Test {
	public static void main(String[] args) {
		pk1to1();
	}

	public static void testCfg() {
		Configuration cfg = new Configuration().configure();
		System.out.println(cfg.getProperty("dialect"));
	}

	public static void getUser() {
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		TUserId userId = new TUserId("Tom", "md");
		TUser user = (TUser) session.load(TUser.class, userId);
		System.out.println(user.getAge());
	}

	public static void onetomany() {
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Person person = new Person();
		person.setPname("p1");
		person.setAge((short) 24);
		for (int i = 0; i < 2; i++) {
			Tel tel = new Tel();
			tel.setTnumber("number:" + i);
			person.getTels().add(tel);
		}
		session.save(person);
		transaction.commit();
		session.clear();
		session.close();
	}

	public static void manytomany() {
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		transaction.commit();
		session.clear();
		session.close();
	}

	public static void onetoone() {
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		TOrder order = new TOrder();
		order.setOname("order1");
		order.setRiqi("2014-11-01");
		TOrderDetail detail = new TOrderDetail();
		detail.setItem1("item1");
		detail.setTOrder(order);
		order.setDetail(detail);
		session.save(order);
		transaction.commit();
		session.clear();
		session.close();
	}

	public static void pk1to1() {
		Configuration configuration = new Configuration().configure();
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		TCom com = new TCom("com1");
		TEmp emp = new TEmp("emp1");
		com.setEmp(emp);
		emp.setCom(com);
		session.save(com);
		transaction.commit();
		session.clear();
		session.close();
	}
}
