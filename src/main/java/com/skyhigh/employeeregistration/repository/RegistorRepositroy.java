package com.skyhigh.employeeregistration.repository;

import java.util.Collections;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.skyhigh.employeeregistration.entity.Registor;

@Component
public class RegistorRepositroy {
	@Autowired
	private SessionFactory sessionFactory;
	
	public void save(Registor registor) {
		Session session =sessionFactory.openSession();
		try {	
			
		Transaction transaction=session.beginTransaction();
		session.merge(registor);
		transaction.commit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			session.close();			
		}
		
		
	}
	@SuppressWarnings({ "unused", "unchecked" })
	public List<Registor> findAll(){
		Session session=sessionFactory.openSession();
		try {
			String hql="from registor";
			@SuppressWarnings("rawtypes")
			Query query=session.createQuery(hql);
		} catch (Exception e) {
		
		}
		finally {
			session.close();
		}
		return Collections.EMPTY_LIST ;
		
	}

}
