package com.Products.ps.models.product;


import jakarta.persistence.*;

@Entity
@Table(name="product_assets_view")
public class ProductAsset implements java.io.Serializable {
	@Id
	@Column(name = "id", nullable = false)
	private Long id;
	 @Column(name = "product_code", nullable = false)
    private String productCode;
	@Column(name = "asset_code", nullable = false)
	private String assetCode;
	 @Column(name = "content", nullable = false)
    private String content;
    @Column(name = "is_enabled", nullable = false)
    private String isEnabled;

    public ProductAsset() {
    }

    public ProductAsset(Long id, String productCode, String assetCode, String content, String isEnabled) {
    	this.id = id;
        this.productCode = productCode;
        this.assetCode = assetCode;
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
        return this.productCode;
    }
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    
    public String getAssetCode() {
        return this.assetCode;
    }
    public void setAssetCode(String assetCode) {
        this.assetCode = assetCode;
    }
   
    public String getContent() {
        return this.content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    
    public String getIsEnabled() {
        return this.isEnabled;
    }
    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }


}
