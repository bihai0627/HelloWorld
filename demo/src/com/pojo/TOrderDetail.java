package com.pojo;

/**
 * TOrderDetail entity. @author MyEclipse Persistence Tools
 */

public class TOrderDetail implements java.io.Serializable {

	// Fields

	private Integer id;
	private TOrder TOrder;
	private String item1;

	// Constructors

	/** default constructor */
	public TOrderDetail() {
	}

	/** full constructor */
	public TOrderDetail(TOrder TOrder, String item1) {
		this.TOrder = TOrder;
		this.item1 = item1;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public TOrder getTOrder() {
		return this.TOrder;
	}

	public void setTOrder(TOrder TOrder) {
		this.TOrder = TOrder;
	}

	public String getItem1() {
		return this.item1;
	}

	public void setItem1(String item1) {
		this.item1 = item1;
	}

}