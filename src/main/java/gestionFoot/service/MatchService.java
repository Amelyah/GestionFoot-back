package gestionFoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import gestionFoot.exception.MatchException;
import gestionFoot.model.Match;
import gestionFoot.repository.MatchRepository;

@Service
public class MatchService {

	@Autowired
	private MatchRepository matchRepo;
	
	public List<Match> getAll() {
		return matchRepo.findAll();
	}

	public Match getById(Integer id) {
		return matchRepo.findById(id).orElseThrow(MatchException::new);
	}

	public Match create(Match match) {
		return matchRepo.save(match);
	}

	public Match update(Match match) {
		return matchRepo.save(match);
	}

	public void deleteById(Integer id) {
		matchRepo.deleteById(id);
	}
}
