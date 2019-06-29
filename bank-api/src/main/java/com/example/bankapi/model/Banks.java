package com.example.bankapi.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name ="banks")
@Entity
public class Banks {
	@Id
	@Column(name="id")
	private int id;
	private String name;
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Banks() {
		
	}
	

}
