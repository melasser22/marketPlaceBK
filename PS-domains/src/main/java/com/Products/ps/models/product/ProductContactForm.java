package com.Products.ps.models.product;

import jakarta.persistence.*;

import java.sql.Timestamp;
import  java.util.Date;


@Entity
@Table(name="products_contact_forms")
public class ProductContactForm implements  java.io.Serializable{

    @Id
    @Column(name = "id", nullable = false ,unique = true)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "full_name", nullable = false)
    private  String fullName;

    @Column(name = "email", nullable = false)
    private  String email;

    @Column(name = "message", nullable = false)
    private  String message;

    @Column(name = "inquiry_type", nullable = false)
    private  String inquiryType;

    @Column(name = "mobile", nullable = false)
    private  String mobile;

    @Column(name = "product_code", nullable = false)
    private  String productCode;

    @Column(name = "message_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date messageDate;

    @PrePersist
    public void prePersist() {
        this.messageDate = new Timestamp(System.currentTimeMillis());
    }

    public ProductContactForm() {
    }
    public ProductContactForm(String fullName, String email, String message, String inquiryType, String mobile, String productCode , Date messageDate) {
        this.fullName = fullName;
        this.email = email;
        this.message = message;
        this.inquiryType = inquiryType;
        this.mobile = mobile;
        this.productCode = productCode;
        this.messageDate = messageDate;
    }

    public Long getId() {
        return id;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public String getInquiryType() {
        return inquiryType;
    }
    public void setInquiryType(String inquiryType) {
        this.inquiryType = inquiryType;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getProductCode() {
        return productCode;
    }
    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
    public Date getMessageDate() {
        return messageDate;
    }
}
