package com.pojo;

/**
 * TCom entity. @author MyEclipse Persistence Tools
 */

public class TCom implements java.io.Serializable {

	// Fields

	private Integer id;
	private String cname;
	private TEmp emp;

	// Constructors

	/** default constructor */
	public TCom() {
	}

	/** full constructor */
	public TCom(String cname) {
		this.cname = cname;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCname() {
		return this.cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public TEmp getEmp() {
		return emp;
	}

	public void setEmp(TEmp emp) {
		this.emp = emp;
	}

}