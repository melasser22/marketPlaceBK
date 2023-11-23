package com.Ebilling.ps.models.setup;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SYSTEM_PARAMETERS")


public class SystemParameter {

    @Id
    @Column

	private Long sp_id;
    
    @Column
	private String sp_module;
    
    @Column
	private String sp_name;
    
    @Column
	private String sp_value;

	public Long getSp_id() {
		return sp_id;
	}

	public void setSp_id(Long sp_ID) {
		sp_id = sp_ID;
	}

	public String getSp_module() {
		return sp_module;
	}

	public void setSp_module(String sp_Module) {
		sp_module = sp_Module;
	}

	public String getSp_name() {
		return sp_name;
	}

	public void setSp_name(String sp_Name) {
		sp_name = sp_Name;
	}

	public String getSp_value() {
		return sp_value;
	}

	public void setSp_value(String sp_Value) {
		sp_value = sp_Value;
	}
}
