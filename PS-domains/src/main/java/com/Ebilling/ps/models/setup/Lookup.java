package com.Ebilling.ps.models.setup;


import com.Ebilling.ps.constants.GlobalConstants;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "LOOKUPS", schema = GlobalConstants.SETUP_SCHEMA)

public class Lookup {
	@Id
	 @Column
		private String lookupItemId;
	 public String getLookupItemId() {
		return lookupItemId;
	}
	public void setLookupItemId(String lookupItemId) {
		this.lookupItemId = lookupItemId;
	}
	public String getLookupItemCd() {
		return lookupItemCd;
	}
	public void setLookupItemCd(String lookupItemCd) {
		this.lookupItemCd = lookupItemCd;
	}
	public String getLookupItemEnNm() {
		return LookupItemEnNm;
	}
	public void setLookupItemEnNm(String lookupItemEnNm) {
		LookupItemEnNm = lookupItemEnNm;
	}
	public String getLookupItemArNm() {
		return LookupItemArNm;
	}
	public void setLookupItemArNm(String lookupItemArNm) {
		LookupItemArNm = lookupItemArNm;
	}
	public String getLookupGroupCode() {
		return LookupGroupCode;
	}
	public void setLookupGroupCode(String LookupGroupCode) {
		this.LookupGroupCode = LookupGroupCode;
	}
	
	public Boolean getisActive() {
		return isActive;
	}
	public void setisActive(Boolean isActive) {
		this.isActive = isActive;
	}
	public String getItemendescription() {
		return itemendescription;
	}
	public void setItemendescription(String itemendescription) {
		this.itemendescription = itemendescription;
	}
	public String getItemardescription() {
		return itemardescription;
	}
	public void setItemardescription(String itemardescription) {
		this.itemardescription = itemardescription;
	}
	@Column
		private String lookupItemCd;
	 @Column
		private String LookupItemEnNm;
    
	 @Column
		private String LookupItemArNm;

	 @Column
		private String LookupGroupCode;

	 @Column
		private String parentlookupId;

	 public String getParentlookupId() {
		return parentlookupId;
	}
	public void setParentlookupId(String parentlookupId) {
		this.parentlookupId = parentlookupId;
	}
	@Column
		private Boolean isActive;
	 @Column
		private String itemendescription;
	 @Column
		private String itemardescription;

}
