package com.example.bankapi.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.example.bankapi.model.Banks;

@Entity
@Table(name="branches")
public class Branches {

	@Id
	private String  ifsc;
	private String  branch;
	private String address; 
	private String city;
	private String district;
	private String state;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="bank_id",referencedColumnName="id")
	private Banks banks;
	
	public Banks getBanks() {
		return banks;
	}
	
	public void setBanks(Banks banks) {
		this.banks = banks;
	}
	
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

	public Branches() {	
	}
	
	
}
