package com.security.Authentication.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_role")
public class Role {

	@Id
	@Column(name = "roleid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long roleid;
	private String name;
	
	
	public long getId() {
		return roleid;
	}
	public void setId(long roleid) {
		this.roleid = roleid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
