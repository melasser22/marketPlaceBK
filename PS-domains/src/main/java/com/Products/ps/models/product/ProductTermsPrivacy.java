package com.Products.ps.models.product;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="products_terms_privacy_view")
public class ProductTermsPrivacy  implements java.io.Serializable{
    @Id
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "product_code", nullable = false)
    private String productCode;

    @Column(name = "code", nullable = false)
    private String code;

    @Column(name = "en_content", nullable = false)
    private String enContent;

    @Column(name = "ar_content", nullable = false)
    private String arContent;

    public ProductTermsPrivacy() {
    }

    public ProductTermsPrivacy(Long id, String productCode, String code, String enContent, String arContent) {
        this.id = id;
        this.productCode = productCode;
        this.code = code;
        this.enContent = enContent;
        this.arContent = arContent;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getEnContent() {
        return enContent;
    }

    public void setEnContent(String enContent) {
        this.enContent = enContent;
    }

    public String getArContent() {
        return arContent;
    }

    public void setArContent(String arContent) {
        this.arContent = arContent;
    }
}
