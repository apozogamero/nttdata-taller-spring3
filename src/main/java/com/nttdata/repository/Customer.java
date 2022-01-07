package com.nttdata.repository;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "spring_customer")
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long ID;
	private String name, lastname1, lastname2, idn;
	private Date birthdate;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long getID() {
		return ID;
	}
	
	public void setID(Long ID) {
		this.ID = ID;
	}
	
	@Column(name = "NAME", nullable = false)
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "LASTNAME1", nullable = false)
	public String getLastname1() {
		return lastname1;
	}
	
	public void setLastname1(String lastname1) {
		this.lastname1 = lastname1;
	}
	
	@Column(name = "LASTNAME2", nullable = false)
	public String getLastname2() {
		return lastname2;
	}
	
	public void setLastname2(String lastname2) {
		this.lastname2 = lastname2;
	}
	
	@Column(name = "IDN", nullable = false, unique = true, length = 9)
	public String getIdn() {
		return idn;
	}
	
	public void setIdn(String idn) {
		this.idn = idn;
	}
	
	@Column(name = "BIRTH_DATE", nullable = false)
	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	@Override
	public String toString() {
		return "Customer [ID=" + ID + ", name=" + name + ", lastname1=" + lastname1 + ", lastname2=" + lastname2
				+ ", idn=" + idn + ", birthdate=" + birthdate + "]";
	}
	
}
