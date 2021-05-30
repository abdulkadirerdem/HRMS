package kodlamaio.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.hrms.entities.concretes.Condidate;

public interface CondidateDao extends JpaRepository<Condidate, Integer> {

}