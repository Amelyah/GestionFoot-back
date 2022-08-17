package gestionFoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestionFoot.exception.EntraineurException;
import gestionFoot.model.Entraineur;
import gestionFoot.repository.EntraineurRepository;


@Service
public class EntraineurService {
	
	@Autowired
	private EntraineurRepository entraineurRepo;
	
	public List<Entraineur> getAll() {
		return entraineurRepo.findAll();
	}

	public Entraineur getById(Integer id) {
		return entraineurRepo.findById(id).orElseThrow(EntraineurException::new);
	}

	public Entraineur create(Entraineur entraineur) {
		return entraineurRepo.save(entraineur);
	}

	public Entraineur update(Entraineur entraineur) {
		return entraineurRepo.save(entraineur);
	}

	public void deleteById(Integer id) {
		entraineurRepo.deleteById(id);
	}
	
}
