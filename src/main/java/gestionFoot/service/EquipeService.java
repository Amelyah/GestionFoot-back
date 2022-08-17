package gestionFoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestionFoot.exception.EquipeException;
import gestionFoot.model.Equipe;
import gestionFoot.repository.EquipeRepository;

@Service
public class EquipeService {
	
	@Autowired
	private EquipeRepository equipeRepo;
	
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
