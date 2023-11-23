package com.Ebilling.ps.models.setup;

import com.Ebilling.ps.constants.GlobalConstants;
import jakarta.persistence.*;

@Entity
@Table(name = "City")
public class City implements java.io.Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 2208780992511506774L;
    private long cityId;

    private long countryId;
    private String cityCd;
    private String cityEnNm;
    private String cityArNm;

    public City() {
    }

    public City(long cityId, long countryId, String cityCd, String cityEnNm, String cityArNm) {
        this.cityId = cityId;
        this.countryId = countryId;
        this.cityCd = cityCd;
        this.cityEnNm = cityEnNm;
        this.cityArNm = cityArNm;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "city_id", unique = true, nullable = false)
    public long getCityId() {
        return this.cityId;
    }

    public void setCityId(long cityId) {
        this.cityId = cityId;
    }

    @Column(name = "city_cd", nullable = false)
    public String getCityCd() {
        return this.cityCd;
    }

    public void setCityCd(String cityCd) {
        this.cityCd = cityCd;
    }
    @Column(name = "country_id", nullable = true)

    public long getCountryId() {
        return countryId;
    }

    public void setCountryId(long countryId) {
        this.countryId = countryId;
    }

    @Column(name = "City_En_Nm")
    public String getCityEnNm() {
        return this.cityEnNm;
    }

    public void setCityEnNm(String cityEnNm) {
        this.cityEnNm = cityEnNm;
    }

    @Column(name = "City_Ar_Nm")
    public String getCityArNm() {
        return this.cityArNm;
    }

    public void setCityArNm(String cityArNm) {
        this.cityArNm = cityArNm;
    }

}
