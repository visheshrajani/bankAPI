package com.example.bankapi.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.bankapi.model.Branches;
import com.example.bankapi.repository.BranchesRepository;

@RestController
@RequestMapping("/api")
public class BranchesController {
	

	
	@Autowired
	private BranchesRepository branchesRepository;

	@GetMapping(value="/bank")
	public Branches getDetails(@RequestParam(value="ifsc") String ifsc)
	{
		return branchesRepository.findOne(ifsc);
		
	}
	 @GetMapping(value="/branches")
	public List<Branches> getBranches(@RequestParam(value="name") String name,@RequestParam(value="city") String city,
			@RequestParam(value="offset", defaultValue="0") Integer offset,
			@RequestParam(value="limit", defaultValue="branchesRepository.findByBanksNameAndCity(name, city).size()") Integer limit)
	{
		 List<Branches> branches=branchesRepository.findByBanksNameAndCity(name, city);
		 List<Branches> b=branches.subList(offset-1, offset+limit-1);
		 return b;
		

	}
	 
	 //
//


	
}
