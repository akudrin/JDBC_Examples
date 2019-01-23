package com.akudrin.jdbc.examples;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmployeeID")
	private int EmployeeID;
    @Column(name = "Name")
	private String Name;
    @Column(name = "Gender")
	private String Gender;
    @Column(name = "DNR")
	private int DNR;

	public Employee() {
		
	}
    
	public Employee(String name, String gender, int dNR) {
		super();
		Name = name;
		Gender = gender;
		DNR = dNR;
	}

	public int getEmployeeID() {
		return EmployeeID;
	}

	public void setEmployeeID( int id ) {
		this.EmployeeID = id;
	}

	public String getName() {
		return Name;
	}

	public void setName( String name ) {
		this.Name = name;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender( String gender ) {
		this.Gender = gender;
	}

	public int getDNR() {
		return DNR;
	}

	public void setDNR( int dnr) {
		this.DNR = dnr;
	}
}