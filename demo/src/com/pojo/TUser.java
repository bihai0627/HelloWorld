package com.pojo;

/**
 * TUser entity. @author MyEclipse Persistence Tools
 */

public class TUser implements java.io.Serializable {

	// Fields

	private TUserId id;
	private Integer age;

	// Constructors

	/** default constructor */
	public TUser() {
	}

	/** full constructor */
	public TUser(TUserId id) {
		this.id = id;
	}

	public TUser(TUserId id, Integer age) {
		super();
		this.id = id;
		this.age = age;
	}

	// Property accessors

	public TUserId getId() {
		return this.id;
	}

	public void setId(TUserId id) {
		this.id = id;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

}