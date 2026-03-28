package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CakeModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Long id;
	private String cakename;
	private String caketype;
	private String cakeprice;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCakename() {
		return cakename;
	}
	public void setCakename(String cakename) {
		this.cakename = cakename;
	}
	public String getCaketype() {
		return caketype;
	}
	public void setCaketype(String caketype) {
		this.caketype = caketype;
	}
	public String getCakeprice() {
		return cakeprice;
	}
	public void setCakeprice(String cakeprice) {
		this.cakeprice = cakeprice;
	}
	
	
	
}
