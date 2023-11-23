package com.Ebilling.ps.models.common;

import java.io.Serializable;

public class SortingParameters implements Serializable {
	private static final long serialVersionUID = 1L;
	private String sortFields;
	private String sortOrders;

	public String getSortFields() {
		return sortFields;
	}

	public void setSortFields(String sortFields) {
		this.sortFields = sortFields;
	}

	public String getSortOrders() {
		return sortOrders;
	}

	public void setSortOrders(String sortOrders) {
		this.sortOrders = sortOrders;
	}
}
