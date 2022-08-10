package gestionFoot.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import gestionFoot.model.Entraineur;

@Repository
@Transactional
public class DAOEntraineur implements IDAOEntraineur {
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Entraineur findById(Integer id) {
		Entraineur m = null;
		try {
			m = em.find(Entraineur.class, id);
		}
		catch(Exception e) {e.printStackTrace();}

		return m;
	}

	@Override
	public List<Entraineur> findAll() {
		List<Entraineur> Entraineurs =new ArrayList();
		try {
			Entraineurs = em.createQuery("from Entraineur").getResultList();
		}catch(Exception e) {e.printStackTrace();}
		return Entraineurs;
	}

	@Override
	public Entraineur save(Entraineur p) {
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
			Entraineur m = em.find(Entraineur.class, id);
			em.remove(m);
		}
		catch (Exception ex) {
			ex.printStackTrace();
			
		}
	}

}
