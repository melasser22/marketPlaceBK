package com.saas.products.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="product_pricing_list")
public class ProductPricingPlan {
	@Id
	@Column(name = "id", nullable = false)
	private Long id;
	@Column(name = "code", nullable = false)
    private String productCode;
	@Column(name = "product_id", nullable = false)
	private Long productId;
	@Column(name = "plan_name", nullable = false)
	private String planName;
	 @Column(name = "price", nullable = false)
    private String price;
    @Column(name = "period", nullable = false)
    private String period;
    @Column(name = "plan_subtitle", nullable = false)
    private String planSubtitle;
    @OneToMany(mappedBy = "productPricingList", cascade = CascadeType.ALL)
    private List<ProductPricingPlanDetail> pricingPlanDetails;
    
	public ProductPricingPlan() {
	}

	public ProductPricingPlan(Long id, String productCode, Long productId, String planName, String price,
			String period, String planSubtitle, List<ProductPricingPlanDetail> pricingPlanDetails) {
		this.id = id;
		this.productCode = productCode;
		this.productId = productId;
		this.planName = planName;
		this.price = price;
		this.period = period;
		this.planSubtitle = planSubtitle;
		this.pricingPlanDetails = pricingPlanDetails;
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

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}


	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getPlanSubtitle() {
		return planSubtitle;
	}

	public void setPlanSubtitle(String planSubtitle) {
		this.planSubtitle = planSubtitle;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public List<ProductPricingPlanDetail> getPricingPlanDetails() {
		return pricingPlanDetails;
	}

	public void setPricingPlanDetails(List<ProductPricingPlanDetail> pricingPlanDetails) {
		this.pricingPlanDetails = pricingPlanDetails;
	}

	@Override
	public String toString() {
		String details = this.pricingPlanDetails.toString();
	
		return "ProductPricingPlan [id=" + id + ", productCode=" + productCode + ", productId=" + productId
				+ ", planName=" + planName + ", price=" + price + ", period=" + period
				+ ", planSubtitle=" + planSubtitle + ", pricingPlanDetails=" + details+ "]";
	}
    
	
    
}
