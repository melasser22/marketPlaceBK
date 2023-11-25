package com.Products.ps.models.common;

import java.util.List;

public class ResultSet<T> {
	private List<T> returnedList;
	private PaginationOutRec paginationOutRec;

	public List<T> getReturnedList() {
		return returnedList;
	}

	public void setReturnedList(List<T> returnedList) {
		this.returnedList = returnedList;
	}

	public PaginationOutRec getPaginationOutRec() {
		return paginationOutRec;
	}

	public void setPaginationOutRec(PaginationOutRec paginationOutRec) {
		this.paginationOutRec = paginationOutRec;
	}

}
