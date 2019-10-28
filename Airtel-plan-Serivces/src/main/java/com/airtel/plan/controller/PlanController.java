package com.airtel.plan.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.airtel.plan.model.Plans;
import com.airtel.plan.service.PlanService;

@RestController
@CrossOrigin(origins = { "http://localhost:3000"})
@RequestMapping("/api")
public class PlanController {



    @Autowired
    PlanService planService;

    @GetMapping("/plans")
    public List<Plans> getAllNotes() {
        return  planService.getAllplans();
    }
    
    @GetMapping("/hello")
    public String getMessgae() {
        return  "Hello Kundan";
    }
}
