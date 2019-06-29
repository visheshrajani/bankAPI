package com.example.bankapi.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bankapi.model.Branches;

import com.example.bankapi.repository.BranchesRepository;

@RestController
@RequestMapping("/api")
public class BranchesController {
	

	
	@Autowired
	private BranchesRepository branchesRepository;

	@GetMapping(value="/{ifsc}")
	public Branches getDetails(@PathVariable String ifsc)
	{
		return branchesRepository.findOne(ifsc);
		
	}
	 @GetMapping(value="/{name}/{city}/offset={offset}&limit={limit}")
	public List<Branches> getBranches(@PathVariable(value="name") String name,@PathVariable(value="city") String city,@PathVariable(value="offset") Integer offset,@PathVariable(value="limit") Integer limit)
	{
		 List<Branches> branches=branchesRepository.findByBanksNameAndCity(name, city);
		 List<Branches> b=branches.subList(offset, offset+limit);
		 return b;
		

	}
	 
	 @GetMapping(value="/{name}/{city}")
	public List<Branches> getBranches(@PathVariable(value="name") String name,@PathVariable(value="city") String city)
	{
		 return branchesRepository.findByBanksNameAndCity(name, city);
		

	} 	

	
}
