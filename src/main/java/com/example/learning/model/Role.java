package com.example.learning.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class Role {

	@Id
	@Column(name="role_id")
	private int roleId;
	@Column(name="role_name")
	private String roleName;
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Role(int roleId, String roleName) {
		super();
		this.roleId = roleId;
		this.roleName = roleName;
	}
	public Role() {
		
	}
	
	
}
