package gestionFoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestionFoot.exception.MilieuException;
import gestionFoot.model.Milieu;
import gestionFoot.repository.MilieuRepository;


@Service
public class MilieuService {
	
	@Autowired
	private MilieuRepository milieuRepo;
	

	public List<Milieu> getAll() {
		return milieuRepo.findAll();
	}

	public Milieu getById(Integer id) {
		return milieuRepo.findById(id).orElseThrow(MilieuException::new);
	}

	public Milieu create(Milieu milieu) {
		return milieuRepo.save(milieu);
	}

	public Milieu update(Milieu milieu) {
		return milieuRepo.save(milieu);
	}

	public void deleteById(Integer id) {
		milieuRepo.deleteById(id);
	}

}
