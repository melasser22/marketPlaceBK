package com.Products.ps.models.product;
import jakarta.persistence.*;

@Entity
@Table(name="product_partners_view")
public class ProductPartner implements java.io.Serializable {
	@Id
	@Column(name = "id", nullable = false)
	private Long id;
	 @Column(name = "product_code", nullable = false)
    private String productCode;
	@Column(name = "partner_code", nullable = false)
	private String partnerCode;
	 @Column(name = "content", nullable = false)
    private String content;
    @Column(name = "is_enabled", nullable = false)
    private String isEnabled;
	public ProductPartner() {
	}
	public ProductPartner(Long id, String productCode, String partnerCode, String content, String isEnabled) {
		super();
		this.id = id;
		this.productCode = productCode;
		this.partnerCode = partnerCode;
		this.content = content;
		this.isEnabled = isEnabled;
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
	public String getPartnerCode() {
		return partnerCode;
	}
	public void setPartnerCode(String partnerCode) {
		this.partnerCode = partnerCode;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getIsEnabled() {
		return isEnabled;
	}
	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}

}
