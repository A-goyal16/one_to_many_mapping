package onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class StateDriver 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("mapping");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		State s=new State();
		s.setId(1);
		s.setName("Rajasthan");
		s.setCheifMinisterName("Bhajan Lal Sharma");
		
		MLA m=new MLA();
		m.setId(1);
		m.setName("Govind Singh");
		m.setAge(55);
		
		MLA m1=new MLA();
		m1.setId(2);
		m1.setName("Raj Kumar roat");
		m1.setAge(35);
		
		List<MLA> mla=new ArrayList<MLA>();
		mla.add(m);
		mla.add(m1);
		
		s.setMla(mla);
		et.begin();
		em.persist(s);
		em.persist(m);
		em.persist(m1);
		et.commit();
	
	}
}
