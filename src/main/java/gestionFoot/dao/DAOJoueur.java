package gestionFoot.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import gestionFoot.model.Joueur;

@Repository
@Transactional
public class DAOJoueur implements IDAOJoueur{
	
	@PersistenceContext
	private EntityManager em;
	
	@Override
	public Joueur findById(Integer id) {
		Joueur m = null;
		try {
			m = em.find(Joueur.class, id);
		}
		catch(Exception e) {e.printStackTrace();}

		return m;
	}

	@Override
	public List<Joueur> findAll() {
		List<Joueur> Joueurs =new ArrayList();
		try {
			Joueurs = em.createQuery("from Joueur").getResultList();
		}catch(Exception e) {e.printStackTrace();}
		return Joueurs;
	}

	@Override
	public Joueur save(Joueur p) {
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
			Joueur m = em.find(Joueur.class, id);
			em.remove(m);
		}
		catch (Exception ex) {
			ex.printStackTrace();
			
		}
	}

}
