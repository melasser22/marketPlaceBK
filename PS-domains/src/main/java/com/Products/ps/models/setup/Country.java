package com.Products.ps.models.setup;

import com.Products.ps.constants.GlobalConstants;
import jakarta.persistence.*;

@Entity
@Table(name = "Country")
public class Country implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private Long countryId;

    private String countryCd;
    private String countryEnNm;
    private String countryArNm;
    private String nationalityEnNm;
    private String nationalityArNm;
    private String countryIso2Code;
    private String countryIsoCode;
    private String countryDialingCode;
    private String countryFlag;


    public Country() {
    }

    public Country(Long countryId, String countryCd) {
        this.countryId = countryId;
        this.countryCd = countryCd;
    }

    public Country(Long countryId, String countryCd, String countryEnNm,
                   String countryArNm, String nationalityEnNm, String nationalityArNm, String countryIso2Code,
                   String countryIsoCode, String countryDialingCode ,String countryFlag) {
        this.countryId = countryId;
        this.countryCd = countryCd;
        this.countryEnNm = countryEnNm;
        this.countryArNm = countryArNm;
        this.nationalityEnNm = nationalityEnNm;
        this.nationalityArNm = nationalityArNm;
        this.countryIso2Code = countryIso2Code;
        this.countryIsoCode = countryIsoCode;
        this.countryDialingCode = countryDialingCode;
        this.countryFlag = countryFlag;

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Country_Id", unique = true, nullable = false)
    public Long getCountryId() {
        return this.countryId;
    }

    public void setCountryId(Long countryId) {
        this.countryId = countryId;
    }


    @Column(name = "Country_Cd", nullable = false)
    public String getCountryCd() {
        return this.countryCd;
    }

    public void setCountryCd(String countryCd) {
        this.countryCd = countryCd;
    }

    @Column(name = "Country_En_Nm")
    public String getCountryEnNm() {
        return this.countryEnNm;
    }

    public void setCountryEnNm(String countryEnNm) {
        this.countryEnNm = countryEnNm;
    }

    @Column(name = "Country_Ar_Nm")
    public String getCountryArNm() {
        return this.countryArNm;
    }

    public void setCountryArNm(String countryArNm) {
        this.countryArNm = countryArNm;
    }

    @Column(name = "Nationality_En_Nm")
    public String getNationalityEnNm() {
        return this.nationalityEnNm;
    }

    public void setNationalityEnNm(String nationalityEnNm) {
        this.nationalityEnNm = nationalityEnNm;
    }

    @Column(name = "Nationality_Ar_Nm")
    public String getNationalityArNm() {
        return this.nationalityArNm;
    }

    public void setNationalityArNm(String nationalityArNm) {
        this.nationalityArNm = nationalityArNm;
    }

    @Column(name = "Country_ISO_2_Code")
    public String getCountryIso2Code() {
        return this.countryIso2Code;
    }

    public void setCountryIso2Code(String countryIso2Code) {
        this.countryIso2Code = countryIso2Code;
    }

    @Column(name = "Country_ISO_Code")
    public String getCountryIsoCode() {
        return this.countryIsoCode;
    }

    public void setCountryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
    }

    @Column(name = "Country_Dialing_Code")
    public String getCountryDialingCode() {
        return this.countryDialingCode;
    }

    public void setCountryDialingCode(String countryDialingCode) {
        this.countryDialingCode = countryDialingCode;
    }

    @Column(name = "Country_Flag")
    public String getCountryFlag() {
        return countryFlag;
    }

    public void setCountryFlag(String countryFlag) {
        this.countryFlag = countryFlag;
    }
}
