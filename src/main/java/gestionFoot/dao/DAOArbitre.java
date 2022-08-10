package gestionFoot.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import gestionFoot.model.Arbitre;


@Repository
@Transactional
public class DAOArbitre implements IDAOArbitre {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Arbitre findById(Integer id) {
		Arbitre m = null;
		try {
			m = em.find(Arbitre.class, id);
		}
		catch(Exception e) {e.printStackTrace();}

		return m;
	}

	@Override
	public List<Arbitre> findAll() {
		List<Arbitre> Arbitres =new ArrayList();
		try {
			Arbitres = em.createQuery("from Arbitre").getResultList();
		}catch(Exception e) {e.printStackTrace();}
		return Arbitres;
	}

	@Override
	public Arbitre save(Arbitre p) {
		try 
		{
			p = em.merge(p);
		}	
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return p;

	}

	@Override
	public void delete(Integer id) {
		try 
		{
			Arbitre m = em.find(Arbitre.class, id);
			em.remove(m);
		}
		catch (Exception ex) {
			ex.printStackTrace();
			
		}
	}



}
