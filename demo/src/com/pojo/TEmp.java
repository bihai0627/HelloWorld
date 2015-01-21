package com.pojo;

/**
 * TEmp entity. @author MyEclipse Persistence Tools
 */

public class TEmp implements java.io.Serializable {

	// Fields

	private Integer id;
	private String ename;
	private TCom com;

	// Constructors

	/** default constructor */
	public TEmp() {
	}

	/** full constructor */
	public TEmp(String ename) {
		this.ename = ename;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEname() {
		return this.ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public TCom getCom() {
		return com;
	}

	public void setCom(TCom com) {
		this.com = com;
	}

}