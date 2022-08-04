package com.springRest.Springrest.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Students {
	
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long fgrNo;
	private String fnames;
	private String flnames;
		
	public Students(long grNo, String names, String lnames) {
		super();
		fgrNo = grNo;
		fnames = names;
		flnames = lnames;
	}
	
	public Students() {
		super();
		// TODO Auto-generated constructor stub
	}

	public long getGrNo() {
		return fgrNo;
	}

	public void setGrNo(long grNo) {
		fgrNo = grNo;
	}

	public String getNames() {
		return fnames;
	}

	public void setNames(String names) {
		fnames = names;
	}

	public String getLnames() {
		return flnames;
	}

	public void setLnames(String lnames) {
		flnames = lnames;
	}

	@Override
	public String toString() {
		return "Students [GrNo=" + fgrNo + ", Names=" + fnames + ", Lnames=" + flnames + ", getGrNo()=" + getGrNo()
				+ ", getNames()=" + getNames() + ", getLnames()=" + getLnames() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	

}
