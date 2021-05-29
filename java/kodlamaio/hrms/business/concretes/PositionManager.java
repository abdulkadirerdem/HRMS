package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.PositionService;
import kodlamaio.hrms.dataAccess.abstracts.PositionDao;
import kodlamaio.hrms.entities.concretes.JobPositions;

@Service
public class PositionManager implements PositionService {

	private PositionDao positionDao;

	@Autowired
	public PositionManager(PositionDao positionDao) {
		this.positionDao = positionDao;
	}

	@Override
	public List<JobPositions> getAll() {
		// TODO Auto-generated method stub
		return this.positionDao.findAll();
	}

}
