package com.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * TOrder entity. @author MyEclipse Persistence Tools
 */

public class TOrder implements java.io.Serializable {

	// Fields

	private Integer id;
	private String oname;
	private String riqi;
	private TOrderDetail detail;

	// Constructors

	/** default constructor */
	public TOrder() {
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOname() {
		return this.oname;
	}

	public void setOname(String oname) {
		this.oname = oname;
	}

	public String getRiqi() {
		return this.riqi;
	}

	public void setRiqi(String riqi) {
		this.riqi = riqi;
	}

	public TOrderDetail getDetail() {
		return detail;
	}

	public void setDetail(TOrderDetail detail) {
		this.detail = detail;
	}

}