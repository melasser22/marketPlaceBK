package com.Products.ps.models.common;

public class EntityType {

	private String id;
	private String code;
	private String nameEn;
	private String nameAr;

	public String getId() {
		if (id != null && id.isEmpty())
			id = null;

		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		if (code != null && code.isEmpty())
			code = null;

		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNameEn() {
		if (nameEn != null && nameEn.isEmpty())
			nameEn = null;

		return nameEn;
	}

	public void setNameEn(String nameEn) {
		this.nameEn = nameEn;
	}

	public String getNameAr() {
		if (nameAr != null && nameAr.isEmpty())
			nameAr = null;

		return nameAr;
	}

	public void setNameAr(String nameAr) {
		this.nameAr = nameAr;
	}

}
