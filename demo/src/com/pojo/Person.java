package com.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Person entity. @author MyEclipse Persistence Tools
 */

public class Person implements java.io.Serializable {

	// Fields

	private Integer id;
	private String pname;
	private Short age;
	private Set tels = new HashSet(0);

	// Constructors

	/** default constructor */
	public Person() {
	}

	/** full constructor */
	public Person(String pname, Short age, Set tels) {
		this.pname = pname;
		this.age = age;
		this.tels = tels;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Short getAge() {
		return this.age;
	}

	public void setAge(Short age) {
		this.age = age;
	}

	public Set getTels() {
		return this.tels;
	}

	public void setTels(Set tels) {
		this.tels = tels;
	}

}