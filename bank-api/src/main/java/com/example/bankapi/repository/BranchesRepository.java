package com.example.bankapi.repository;

import java.awt.print.Pageable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bankapi.model.Branches;


public interface BranchesRepository extends JpaRepository<Branches,String>{
	List<Branches> findByBanksNameAndCity(String name,String city);

}
