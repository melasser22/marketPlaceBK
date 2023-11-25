package com.Products.ps.models.product;

import jakarta.persistence.*;

@Entity
@Table(name="products_css_view")
public class ProductCss  implements java.io.Serializable{
	@Id
	@Column(name = "id", nullable = false)
	private Long id;
	 @Column(name = "product_code", nullable = false)
    private String productCode;
	@Column(name = "en_css", nullable = false)
	private String enCss;
	 @Column(name = "ar_css", nullable = false)
    private String arCss;
	public ProductCss() {
	}
	
	public ProductCss(Long id, String productCode, String enCss, String arCss) {
		this.id = id;
		this.productCode = productCode;
		this.enCss = enCss;
		this.arCss = arCss;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getEnCss() {
		return enCss;
	}
	public void setEnCss(String enCss) {
		this.enCss = enCss;
	}
	public String getArCss() {
		return arCss;
	}
	public void setArCss(String arCss) {
		this.arCss = arCss;
	}
	
	
}
