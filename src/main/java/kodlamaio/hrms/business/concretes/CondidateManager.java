package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.CondidateService;
import kodlamaio.hrms.dataAccess.abstracts.CondidateDao;
import kodlamaio.hrms.entities.concretes.Condidate;

@Service
public class CondidateManager implements CondidateService {

	private CondidateDao condidateDao;

	@Autowired
	public CondidateManager(CondidateDao condidateDao) {
		this.condidateDao = condidateDao;
	}

	@Override
	public List<Condidate> getAll() {
		return this.condidateDao.findAll();
	}

}
