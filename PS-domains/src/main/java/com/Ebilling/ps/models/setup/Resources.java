package com.Ebilling.ps.models.setup;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "FE_RESOURCES")

public class Resources {
     @Id
	 
	 @Column
		private String fb_id;
     @Column
		private String fr_key;
	 @Column
		private String fr_value_en;
     
	 @Column
		private String fr_value_ar;

	public String getFr_key() {
		return fr_key;
	}

	public void setFr_key(String fr_key) {
		this.fr_key = fr_key;
	}

	public String getFb_id() {
		return fb_id;
	}

	public void setFb_id(String fb_id) {
		this.fb_id = fb_id;
	}

	public String getFr_value_en() {
		return fr_value_en;
	}

	public void setFr_value_en(String fr_value_en) {
		this.fr_value_en = fr_value_en;
	}

	public String getFr_value_ar() {
		return fr_value_ar;
	}

	public void setFr_value_ar(String fr_value_ar) {
		this.fr_value_ar = fr_value_ar;
	}
}
