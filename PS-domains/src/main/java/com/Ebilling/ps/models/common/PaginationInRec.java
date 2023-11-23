package com.Ebilling.ps.models.common;

import java.io.Serializable;

public class PaginationInRec implements Serializable {
	private static final long serialVersionUID = 1L;
	private int pageOffset;
	private int pageSize;

	public int getPageOffset() {
		return pageOffset;
	}

	public void setPageOffset(int pageOffset) {
		this.pageOffset = pageOffset;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

}
