package com.airtel.plan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.airtel.plan.model.Plans;
import com.airtel.plan.repository.PlanRepository;

@Service
public class PlanServiceImpl implements PlanService  {

	@Autowired
    private PlanRepository planRepository;
	@Override
	public List<Plans> getAllplans() {
		
		return planRepository.findAll();
	}

}
