package in.chira.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.chira.entity.Insurence;
import in.chira.repositry.InsurenceRepo;

@Service
public class Inservice {
	@Autowired
	private InsurenceRepo inrepo;
	public void saveplan() {
		Insurence plan=new Insurence();
		plan.setId("in1");
		plan.setName("jibon-bima");
		plan.setPrice(22000.00);
		inrepo.save(plan);
	}

}
