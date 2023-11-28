package com.Products.ps.models.product;

import jakarta.persistence.*;

@Entity
@Table(name="pricing_plan_details")
public class ProductPricingPlanDetail implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
    @Column(name = "plan_feature_type", nullable = false)
    private String planFeatureType;
    @Column(name = "img_path", nullable = true)
    private String imgPath;
	public ProductPricingPlanDetail() {
	}

	public ProductPricingPlanDetail(Long id, ProductPricingPlan productPricingList, String planFeatureKey,
			String planFeatureValue, String planFeatureType, String imgPath) {
		this.id = id;
		this.productPricingList = productPricingList;
		this.planFeatureKey = planFeatureKey;
		this.planFeatureValue = planFeatureValue;
		this.planFeatureType = planFeatureType;
		this.imgPath = imgPath;
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

	public String getPlanFeatureType() {
		return planFeatureType;
	}

	public void setPlanFeatureType(String planFeatureType) {
		this.planFeatureType = planFeatureType;
	}

	public String getImgPath() {
		return imgPath;
	}

	public void setImgPath(String imgPath) {
		this.imgPath = imgPath;
	}

	@Override
	public String toString() {
		return "ProductPricingPlanDetail [id=" + id  + ", planFeatureKey="
				+ planFeatureKey + ", planFeatureValue=" + planFeatureValue + "]";
	}
}
