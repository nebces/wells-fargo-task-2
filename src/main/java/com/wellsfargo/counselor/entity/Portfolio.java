package com.wellsfargo.counselor.entity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue
    private Long portfolioId;

    @Column(nullable = false)
    private String creationDate;

    @Column(nullable = false)
    private Long numSecurities;

    @Column(nullable = false)
    private Long netWorth;

    @Column(nullable = false)
    private Boolean otherInvestments;

    // Constructor
    protected Portfolio(){

    }

    public Portfolio(String creationDate,Long numSecurities, Long netWorth, Boolean otherInvestments ){
        this.creationDate = creationDate;
        this.numSecurities = numSecurities;
        this.netWorth = netWorth;
        this.otherInvestments = otherInvestments;

    }

    public Long getPortfolioId() {
        return portfolioId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Long getNumSecurities() {
        return numSecurities;
    }

    public void setNumSecurities(Long numSecurities) {
        this.numSecurities = numSecurities;
    }

    public Long getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(Long netWorth) {
        this.netWorth = netWorth;
    }

    public Boolean getOtherInvestments() {
        return otherInvestments;
    }

    public void setOtherInvestments(Boolean otherInvestments) {
        this.otherInvestments = otherInvestments;
    }
}
