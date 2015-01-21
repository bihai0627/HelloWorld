package com.pojo;

/**
 * Tel entity. @author MyEclipse Persistence Tools
 */

public class Tel implements java.io.Serializable {

	// Fields

	private Integer id;
	private Person person;
	private String tnumber;

	// Constructors

	/** default constructor */
	public Tel() {
	}

	/** full constructor */
	public Tel(Person person, String tnumber) {
		this.person = person;
		this.tnumber = tnumber;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getTnumber() {
		return this.tnumber;
	}

	public void setTnumber(String tnumber) {
		this.tnumber = tnumber;
	}

}