package com.airtel.plan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.airtel.plan.model.Plans;

@Repository
public interface  PlanRepository extends JpaRepository<Plans, String>  {

}
