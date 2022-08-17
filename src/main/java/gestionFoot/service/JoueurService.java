package gestionFoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestionFoot.exception.JoueurException;
import gestionFoot.model.Joueur;
import gestionFoot.repository.JoueurRepository;

@Service
public class JoueurService {
	
	@Autowired
	private JoueurRepository joueurRepo;
	
	public List<Joueur> getAll() {
		return joueurRepo.findAll();
	}

	public Joueur getById(Integer id) {
		return joueurRepo.findById(id).orElseThrow(JoueurException::new);
	}

	public Joueur create(Joueur arbitre) {
		return joueurRepo.save(arbitre);
	}

	public Joueur update(Joueur arbitre) {
		return joueurRepo.save(arbitre);
	}

	public void deleteById(Integer id) {
		joueurRepo.deleteById(id);
	}
	
}
