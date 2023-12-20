package com.Products.ps.models.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="products")
public class Products  implements java.io.Serializable {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "code", nullable = false)
    private String productCode;


    @Column(name = "saas_product_id", nullable = false)
    private long saasProductId;


    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "en_title", nullable = false)
    private String englishTitle;

    @Column(name = "ar_title", nullable = false)
    private String arabicTitle;

    @Column(name = "is_enabled", nullable = false)
    private String isEnabled;
    @Column(name = "api_key", nullable = false)
    private String apiKey;

    public Products() {
    }

    public Products(Long id, String productCode, long saasProductId, String description, String englishTitle, String arabicTitle, String isEnabled, String apiKey) {
        this.id = id;
        this.productCode = productCode;
        this.saasProductId = saasProductId;
       this.description = description;
        this.englishTitle = englishTitle;
        this.arabicTitle = arabicTitle;
        this.isEnabled = isEnabled;
        this.apiKey=apiKey;
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

    public long getSaasProductId() {
        return saasProductId;
    }

    public void setSaasProductId(long saasProductId) {
        this.saasProductId = saasProductId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
       this.description = description;
    }

    public String getEnglishTitle() {
        return englishTitle;
    }

    public void setEnglishTitle(String englishTitle) {
        this.englishTitle = englishTitle;
    }

    public String getArabicTitle() {
        return arabicTitle;
    }

    public void setArabicTitle(String arabicTitle) {
        this.arabicTitle = arabicTitle;
    }

    public String getIsEnabled() {
        return isEnabled;
    }

    public void setIsEnabled(String isEnabled) {
        this.isEnabled = isEnabled;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }
}
