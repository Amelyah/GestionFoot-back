package gestionFoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestionFoot.exception.ArbitreException;
import gestionFoot.model.Arbitre;
import gestionFoot.repository.ArbitreRepository;


@Service
public class ArbitreService {
	
	@Autowired
	private ArbitreRepository arbitreRepo;
	

	public List<Arbitre> getAll() {
		return arbitreRepo.findAll();
	}

	public Arbitre getById(Integer id) {
		return arbitreRepo.findById(id).orElseThrow(ArbitreException::new);
	}

	public Arbitre create(Arbitre arbitre) {
		return arbitreRepo.save(arbitre);
	}

	public Arbitre update(Arbitre arbitre) {
		return arbitreRepo.save(arbitre);
	}

	public void deleteById(Integer id) {
		arbitreRepo.deleteById(id);
	}

}
