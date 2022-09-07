package com.siemens.eams.employee.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//defining class name as Table name
@Table(name = "EMPLOYEES")
public class Employee extends AbstractEntity	
{
//mark id as primary key
@Id
@Column(name="EMP_ID")
private int id;


@Column(name="FIRST_NAME")
private String firstName;

@Column(name="LAST_NAME")
private String lastName;

@Column(name="EMAIL")
private String email;

@Column(name="PASSWD")
private String password;

@Column(name="ORG_ID")
private int orgid;

@Column(name="ASSET_ID")
private int assetId ;


public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public int getOrgid() {
	return orgid;
}

public void setOrgid(int orgid) {
	this.orgid = orgid;
}

public int getAssetId() {
	return assetId;
}

public void setAssetId(int assetId) {
	this.assetId = assetId;
}


}
