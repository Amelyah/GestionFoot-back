package gestionFoot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import gestionFoot.exception.EquipeException;
import gestionFoot.model.Equipe;
import gestionFoot.repository.AttaquantRepository;
import gestionFoot.repository.EntraineurRepository;
import gestionFoot.repository.EquipeRepository;
import gestionFoot.repository.GardienRepository;

@Service
public class EquipeService {
	
	@Autowired
	private EquipeRepository equipeRepo;
	
	
	public Equipe getByIdWithJoueur(Integer id) {
		return equipeRepo.findEquipeWithJoueur(id).orElseThrow(EquipeException::new);
	}
	
	public List<Equipe> getAll() {
		return equipeRepo.findAll();
	}

	public Equipe getById(Integer id) {
		return equipeRepo.findById(id).orElseThrow(EquipeException::new);
	}

	public Equipe create(Equipe equipe) {
		
		return equipeRepo.save(equipe);
	}

	public Equipe update(Equipe equipe) {
		return equipeRepo.save(equipe);
	}

	public void deleteById(Integer id) {
		equipeRepo.deleteById(id);
	}
	
}
