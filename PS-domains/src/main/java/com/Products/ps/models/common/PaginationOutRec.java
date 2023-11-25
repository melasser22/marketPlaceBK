package com.Products.ps.models.common;

import java.io.Serializable;

public class PaginationOutRec implements Serializable {
	private static final long serialVersionUID = 1L;
	private int wholeResultSetSize;
	private int currentResultSetSize;

	public int getWholeResultSetSize() {
		return wholeResultSetSize;
	}

	public void setWholeResultSetSize(int wholeResultSetSize) {
		this.wholeResultSetSize = wholeResultSetSize;
	}

	public int getCurrentResultSetSize() {
		return currentResultSetSize;
	}

	public void setCurrentResultSetSize(int currentResultSetSize) {
		this.currentResultSetSize = currentResultSetSize;
	}

}
