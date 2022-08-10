package gestionFoot.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import gestionFoot.model.Equipe;

@Repository
@Transactional
public class DAOEquipe implements IDAOEquipe{
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Equipe findById(Integer id) {
		Equipe m = null;
		try {
			m = em.find(Equipe.class, id);
		}
		catch(Exception e) {e.printStackTrace();}

		return m;
	}

	@Override
	public List<Equipe> findAll() {
		List<Equipe> Equipes =new ArrayList();
		try {
			Equipes = em.createQuery("from Equipe").getResultList();
		}catch(Exception e) {e.printStackTrace();}
		return Equipes;
	}

	@Override
	public Equipe save(Equipe p) {
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
			Equipe m = em.find(Equipe.class, id);
			em.remove(m);
		}
		catch (Exception ex) {
			ex.printStackTrace();
			
		}
	}
}
