package kodlamaio.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CondidateService;
import kodlamaio.hrms.entities.concretes.Condidate;

@RestController
@RequestMapping("/api/condidates")
public class CondidateController {

	private CondidateService condidateService;

	@Autowired
	public CondidateController(CondidateService condidateService) {
		this.condidateService = condidateService;
	}

	@GetMapping("/getAll")
	public List<Condidate> getAll() {
		return this.condidateService.getAll();
	}

}
