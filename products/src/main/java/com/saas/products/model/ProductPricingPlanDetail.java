package com.saas.products.model;

import jakarta.persistence.*;

@Entity
@Table(name="pricing_plan_details")
public class ProductPricingPlanDetail {
	@Id
	@Column(name = "id", nullable = false)
	private Long id;
	 @ManyToOne
	    @JoinColumn(name = "product_pricing_list_id")
	    private ProductPricingPlan productPricingList;
	@Column(name = "plan_feature_key", nullable = false)
    private String planFeatureKey;
    @Column(name = "plan_feature_value", nullable = false)
    private String planFeatureValue;
	
	public ProductPricingPlanDetail() {
	}

	public ProductPricingPlanDetail(Long id, ProductPricingPlan productPricingList, String planFeatureKey,
			String planFeatureValue) {
		this.id = id;
		this.productPricingList = productPricingList;
		this.planFeatureKey = planFeatureKey;
		this.planFeatureValue = planFeatureValue;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ProductPricingPlan productPricingList() {
		return productPricingList;
	}

	public void setProductPricingListId(ProductPricingPlan productPricingList) {
		this.productPricingList = productPricingList;
	}

	public String getPlanFeatureKey() {
		return planFeatureKey;
	}

	public void setPlanFeatureKey(String planFeatureKey) {
		this.planFeatureKey = planFeatureKey;
	}

	public String getPlanFeatureValue() {
		return planFeatureValue;
	}

	public void setPlanFeatureValue(String planFeatureValue) {
		this.planFeatureValue = planFeatureValue;
	}

	@Override
	public String toString() {
		return "ProductPricingPlanDetail [id=" + id  + ", planFeatureKey="
				+ planFeatureKey + ", planFeatureValue=" + planFeatureValue + "]";
	}
	
}
